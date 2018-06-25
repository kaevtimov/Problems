package test;

import java.util.Scanner;
// nai dulgata podredica ot chisla koito sa ednakvi
public class ZadachkiArrays4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] numbers = new int[n];

        for(int i = 0; i < numbers.length;i++){
            numbers[i] = scan.nextInt();
        }

        int current = 1;
        int max = 0;

        for(int i = 1; i < numbers.length; i++){
            if (numbers[i] == numbers[i - 1]){
                current++;
                max = Math.max(current, max);
            }
            else {
                max = Math.max(current, max);
                current = 1;
            }
        }
        System.out.println(max);
    }
}



