package TelericAcademy;

import java.util.Scanner;

public class TEST {
    public static int counter = 0;
    public static int bestSum = Integer.MIN_VALUE;
    public static int number;
    public static int current = 1;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String parameters = scanner.nextLine();
        String[] nums = parameters.split(" ");
        int n = Integer.parseInt(nums[0]);
        int m = Integer.parseInt(nums[1]);
        int[][] matrix = new int[n][m];
        boolean[][] isFull = new boolean[n][m];

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
        findSum(0,0,matrix, isFull);

    }
    public static void findSum(int row, int col, int[][] matrix, boolean[][] isFull){
        if(row<0 || row>=matrix.length || col<0 || col>=matrix[0].length){
            return;
        }
        if(matrix[row][col]==number && isFull[row][col]==false){
            current++;
            isFull[row][col] = true;
        }else if(matrix[row][col]!=number && counter>0){
            return;
        }
        if(row == matrix.length-1 && col == matrix[0].length-1){
            System.out.println(bestSum);
        }
        else{
            for (int r = row; r < matrix.length; r++) {
                for (int c = col; c < matrix[0].length; c++) {
                    number = matrix[r][c];
                    isFull[r][c]=true;
                    counter++;
                    findSum(r, c-1,matrix, isFull);
                    findSum(r, c+1,matrix, isFull);
                    findSum(r-1, c,matrix, isFull);
                    findSum(r+1, c,matrix, isFull);
                    if(current>bestSum){
                        bestSum=current;
                    }
                    current=1;
                }
            }
        }
    }
}