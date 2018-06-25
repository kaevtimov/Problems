package TelericAcademy;

import java.util.Arrays;
import java.util.Scanner;

public class TargetSum {

    public static int counter = 0;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int S = scanner.nextInt();
        System.out.println(check(S, numbers, 0, 0));


    }public static int check(int wantedSum, int[] numbers, int index, int current){
        if(index==numbers.length){
            if(current==wantedSum){
                return 1;
            }
            return 0;
        }
        counter=0;
        counter+=check(wantedSum, numbers, index+1, current+numbers[index]);
        counter+=check(wantedSum, numbers, index+1, current-numbers[index]);
        return counter;
    }
}
