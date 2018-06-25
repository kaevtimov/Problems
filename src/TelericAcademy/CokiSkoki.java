package TelericAcademy;

import java.util.Arrays;
import java.util.Scanner;

public class CokiSkoki {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int bestHigh = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            int currentJumps=0;
            for (int j = i+1; j < numbers.length; j++) {
                if(numbers[j]>number){
                    currentJumps++;
                    number = numbers[j];
                }
                if(currentJumps>bestHigh){
                    bestHigh=currentJumps;
                }
            }numbers[i] = currentJumps;
        }

        System.out.println(bestHigh);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        //System.out.println(String.join(" ", numbers));
    }
}
