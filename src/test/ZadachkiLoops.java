package test;
//3
//2
//5
//1	  min=1.00
   // max=5.00
    //sum=11.00
    //avg=2.75

import java.util.Scanner;

public class ZadachkiLoops {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number one: ");
        int N = scanner.nextInt();
        //System.out.println("Please enter number two: ");
        //int K = scanner.nextInt();
        for(int i = 1; i <= N; i++) {
            System.out.println(i);
        }

    }

}
