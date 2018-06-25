package TelericAcademy;

import java.util.Arrays;
import java.util.Scanner;

public class Expressions {
    public static int[] numbers;
    public static int counter;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        numbers = Arrays.stream(scanner.nextLine().split(""))
                .mapToInt(Integer::parseInt)
                .toArray();

        int wantedSum = scanner.nextInt();
//        for (int i = ; i < ; i++) {
//
//        }
        solve(numbers, 0, 0, wantedSum);
        System.out.println(counter);

    }public static int solve(int[] numbers, int index, int currentResult, int wanted){
        if(index==numbers.length){
            if(currentResult==wanted){
                return 1;
            }
            return 0;
        }else{
            counter = 0;
            counter+=solve(numbers, index+1, currentResult+numbers[index], wanted);
            counter+=solve(numbers, index+1,  currentResult-numbers[index], wanted);
            counter+=solve(numbers, index+1,  currentResult*numbers[index], wanted);
            return counter;
        }
    }
}
