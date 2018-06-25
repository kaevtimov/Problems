package test;

import java.util.Scanner;        // namiram 3x3 maxSum v matrica

public class Matrix3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String nm = scanner.nextLine();
        String[] nums = nm.split(" ");
        short n = Short.parseShort(nums[0]);
        short m = Short.parseShort(nums[1]);
        short[][] matrix = new short[n][m];

        for (short row = 0; row < n; row++) {
            short counter = 0;
            String numbers = scanner.nextLine();
            for (short col = 0; col < m; col++) {
                String[] nums1 = numbers.split(" ");
                short numm = Short.parseShort(nums1[counter]);
                if(counter<nums1.length){
                    matrix[row][col]= numm;
                }
                counter++;
            }
        }
        int bestSum = Integer.MIN_VALUE;
        for (short row = 0; row < matrix.length-2; row++) {
            for (short col = 0; col < matrix[0].length - 2; col++) {
                int sum = matrix[row][col] + matrix[row][col + 1] + matrix[row][col + 2]
                        + matrix[row + 1][col] + matrix[row + 1][col + 1] + matrix[row + 1][col + 2]
                        + matrix[row + 2][col] + matrix[row + 2][col + 1] + matrix[row + 2][col + 2];
                if (sum > bestSum) {
                    bestSum = sum;
                }
            }
        }
        System.out.println(bestSum);
    }
}
