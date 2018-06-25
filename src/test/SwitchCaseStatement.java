package test;

import java.util.Scanner;

public class SwitchCaseStatement {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Today is : ");
        int day = scanner.nextInt() ;
        switch(day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Thuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}
