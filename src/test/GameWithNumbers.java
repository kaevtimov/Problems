package test;

import java.util.Scanner;

public class GameWithNumbers {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(" ");
        String[] numbers2 = scanner.nextLine().split(" ");
        int n = Integer.parseInt(numbers[0]);
        int k = Integer.parseInt(numbers[1]);
        int max = 0;

        for (int i = 0; i < numbers2.length; i++) {
            int number = Integer.parseInt(numbers2[i]);
            int min = Math.min(k, number);
            int current = 0;
            for (int j = 2; j <= min; j++) {
                if(number%j==0 && k%j==0){
                    current++;
                }
            }
            if(current>max){
                max=current;
            }
        }

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < numbers2.length; i++) {
            int number = Integer.parseInt(numbers2[i]);
            int min = Math.min(k, number);
            int current = 0;
            for (int j = 2; j <= min; j++) {
                if(number%j==0 && k%j==0){
                    current++;
                }
            }
            if(current==max){
                str.append(i+1);
                str.append(" ");
            }
        }
        if(max==0){
            System.out.println("No winners");
        }else{
            System.out.println(max);
            System.out.println(str);
        }
    }
}
