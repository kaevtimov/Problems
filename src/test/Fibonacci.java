package test;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int prev = 1;
        int next = 1;

        for (int i = 0; i < n-1; i++) {
            next+=prev;
            prev=next-prev;
        }
        if(n<2){
            System.out.println(1);
        }else{
            System.out.println(next);
        }
    }
}
