package test;

import java.util.Scanner;

public class AddToString {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        int digit = 0;
        StringBuilder indexes = new StringBuilder();

        for (int index = 0; index < n; index++) {
            numbers[index] = scanner.nextInt();
            while (numbers[index] > 0) {
                digit =  numbers[index] % 10;
                numbers[index] = numbers[index] / 10;
                if(digit == index){
                    indexes.append(index + " ");
                    break;
                }
            }
        }
        String index = indexes.toString();
        System.out.println(index);
        // 321,345,456,567,678,789,101
    }
}
