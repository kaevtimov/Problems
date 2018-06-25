package test;

import java.util.Scanner;

public class ConditionalStatements {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter your password:");
        String password = scanner.nextLine();
        if (password.length() >= 6 ) {
            System.out.println("Valid password");
        }
        else {
            System.out.println("Invalid password");
        }
    }
}
