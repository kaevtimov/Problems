package test;

import java.util.Scanner;

public class BiggestNum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int other = 0;

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            sum+=num;
            if(num>max){
                max=num;
            }
        }  other=sum-max;
        if(other == max){
            System.out.println("Yes");
            System.out.println("Sum = " + other);
        }else {
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(max - other));
        }
    }
}
