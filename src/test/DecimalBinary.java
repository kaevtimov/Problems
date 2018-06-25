package test;

import java.util.Scanner;

public class DecimalBinary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number;
        number = in.nextInt();

        printBinaryform(number);
    }

    private static void printBinaryform(int number) {
        int remainder;
        if (number <= 1) {
            System.out.print(number);
            return;
        }
        remainder = number %2;
        printBinaryform(number >> 1);
        System.out.print(remainder);
    }
}