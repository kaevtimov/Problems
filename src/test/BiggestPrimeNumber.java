package test;

import java.util.Scanner;

public class BiggestPrimeNumber {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = n; i > 0; i--) {
            if(isPrime(i)==true){
                System.out.println(i);
                break;
            }
        }

    }
    public static boolean isPrime(int number){
        int divider = 2;
        int maxDivider = (int) Math.sqrt(number);
        boolean isPrime = true;
        while (divider <= maxDivider){
            if (number % divider == 0) {
                isPrime = false;
            }
            divider++;
        }
        return isPrime;
    }
}
