package test;

import java.util.Scanner;

public class TryAndCatch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < 100; i++) {
            try{
                int num = scanner.nextInt();
                if(num%2==0){
                    System.out.println("Even number entered: " + num);
                    break;
                }else{
                    System.out.println("Invalid number!");
                }
            }catch(Exception e){
                System.out.println("Invalid number!");
            }
        }
    }
}
