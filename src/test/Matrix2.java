package test;

import java.util.Scanner;
import java.util.Arrays;

public class Matrix2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int[][] numbers = new int[row][col];
        int number = 0;

        for (int rows = 1; rows <= row; rows++) {
            System.out.println();
            for (int cols = 0; cols < col; cols++) {
                number = cols*numbers.length+rows;
                if(number<=9){
                    System.out.print(number + "  ");
                }else{
                    System.out.print(number + " ");
                }
            }
        }
    }
}
