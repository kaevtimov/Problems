package TelericAcademy;

import java.util.Arrays;
import java.util.Scanner;

public class Array4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split(" ");
        int n = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);
        int[][] matrix = new int[n][m];

        int colSum = 1;
        int diagonalSum2 = 1;
        int bestSum = 1;
        for (int row = 0; row < n; row++) {
            int counter = 0;
            String numbers = scanner.nextLine();
            for (int col = 0; col < m; col++) {
                String[] nums1 = numbers.split(" ");
                int numm = Integer.parseInt(nums1[counter]);
                if(counter<nums1.length){
                    matrix[row][col]= numm;
                }
                counter++;
            }
        }

        for (int row = 0; row < matrix.length; row++) {
            int rowSum = 1;
            int diagonalSum1 = 1;
            for (int col = 0; col < matrix[0].length-1; col++) {
                if(matrix[row][col]==matrix[row][col+1]){
                    rowSum++;
                }else{
                    if(rowSum>bestSum){
                        bestSum=rowSum;
                        rowSum=1;
                        continue;
                    }
                }
                if(rowSum>bestSum){
                    bestSum=rowSum;
                }
                if(matrix[row][col]==matrix[row+1][col+1]){
                    diagonalSum1++;
                }else{
                    if(diagonalSum1>bestSum){
                        bestSum=diagonalSum1;
                        diagonalSum1=1;
                        continue;
                    }
                }
            }
        }
        System.out.println(bestSum);
    }
}
