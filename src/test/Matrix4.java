package test;

import java.util.Scanner;
import java.util.Arrays;

public class Matrix4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] numbers = new int[n][n];
        int counter = 1;
        int num = 0;
        int counter1 = 1;
        int counter2 = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(counter2+ " ");
            for (int j = 2; j <= n; j++) {
                if(j%2==0){
                    System.out.print(n*j - i + " ");
                    num = n*j;
                }else{
                    System.out.print(num + counter + " ");
                }
            }
            counter++;
            counter2++;
            System.out.println();
        }
    }
}
