package Recursion;

import java.util.Scanner;

public class Recursion5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(sumNum(n));
    }

    private static int sumNum(int n) {
        int result = 0;
        if(n==0){
            return 0;
        }
        else{
            result = n + sumNum(n-1);
        }
        return result;
    }
}
