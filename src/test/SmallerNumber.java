package test;

import java.util.Scanner;

public class SmallerNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter first number:");
        int firstNum = scanner.nextInt();
        System.out.print("Enter second number:");
        int secNum = scanner.nextInt();

        System.out.print("The smaller one is:");
        if (secNum > firstNum) {
            System.out.println(firstNum);
        }
        else {
            System.out.println(secNum);
        }
    }

}
