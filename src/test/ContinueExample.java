package test;

import java.util.Scanner;

public class ContinueExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = scanner.nextInt();
        for(int i=1;i<=num;i++){
            if(i % 3 != 0 && i % 7 != 0){
                continue;              // t.e. kogato i==5 ne go printva 5 ami produljava po natam
            }
            System.out.println(i);
        }
    }
}