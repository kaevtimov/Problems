package test;

import java.util.Scanner;
import java.util.Arrays;

public class Matrix {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] numArray = new int[rows][cols];  // 2 and 4

//        System.out.println(numArray[0][3]);
//        System.out.println(numArray[0].length);
//        System.out.println(numArray[1].length);
//        System.out.println(numArray.length);

        for (int row = 0; row < rows; row++) {    // numArray.length e ravno na 2 zashtoto ima samo 2 reda
            for (int col = 0; col < cols; col++) {
                numArray[row][col] = scanner.nextInt();
            }
            System.out.println(Arrays.deepToString(numArray));   // deepToString e za matrix
        }

    }
}
