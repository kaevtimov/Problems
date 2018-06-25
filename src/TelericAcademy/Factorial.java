package TelericAcademy;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(factorial(19700));
    }
    public static int factorial(int n){
        if(n<2){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }
}
