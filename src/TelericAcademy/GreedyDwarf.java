package TelericAcademy;

import java.util.Scanner;

public class GreedyDwarf {

    public static int[][] matrix;
    public static int startRow;
    public static int startCol;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        String[] parts = string.split(" ");
        int R = Integer.parseInt(parts[0]);
        int C = Integer.parseInt(parts[1]);
        matrix = new int[R+2][C+2];
        boolean[][] isTrue = new boolean[R+2][C+2];


        for (int i = 0; i < matrix.length; i++) {
            matrix[i][0]=0;
            matrix[i][matrix[0].length-1]=0;
            isTrue[i][0]=false;
            isTrue[i][matrix[0].length-1]=false;
        }
        for (int i = 0; i < matrix[0].length; i++) {
            matrix[0][i] = 0;
            matrix[matrix.length-1][i] = 0;
            isTrue[0][i]=false;
            isTrue[matrix.length-1][i]=false;
        }


        for (int row = 1; row < matrix.length-1; row++) {
            String numbers = scanner.nextLine();
            for (int col = 1; col < matrix[0].length-1; col++) {
                String[] nums = numbers.split(" ");
                int num = Integer.parseInt(nums[col-1]);
                matrix[row][col]=num;
                isTrue[row][col]=true;
                if(matrix[row][col]==0){
                    startRow=row;
                    startCol=col;
                }
            }
        }
        int collectedCoins = 0;

        while(true){
            if(matrix[startRow][startCol-1] >= matrix[startRow+1][startCol] && matrix[startRow][startCol-1] >= matrix[startRow-1][startCol]
                    && matrix[startRow][startCol-1] >= matrix[startRow][startCol+1] && isTrue[startRow][startCol-1]==true){
                startCol = startCol-1;
                collectedCoins++;
                matrix[startRow][startCol]--;
            }else if(matrix[startRow][startCol+1] >= matrix[startRow+1][startCol] && matrix[startRow][startCol+1] >= matrix[startRow][startCol-1]
                    && matrix[startRow][startCol+1] >= matrix[startRow-1][startCol] && isTrue[startRow][startCol+1]==true){
                startCol = startCol+1;
                collectedCoins++;
                matrix[startRow][startCol]--;
            }else if(matrix[startRow-1][startCol] >= matrix[startRow+1][startCol] && matrix[startRow-1][startCol] >= matrix[startRow][startCol+1]
                    && matrix[startRow-1][startCol] >= matrix[startRow][startCol-1] && isTrue[startRow-1][startCol]==true){
                startRow = startRow-1;
                collectedCoins++;
                matrix[startRow][startCol]--;
            }else if(matrix[startRow+1][startCol] >= matrix[startRow-1][startCol] && matrix[startRow+1][startCol] >= matrix[startRow][startCol-1]
                    && matrix[startRow+1][startCol] >= matrix[startRow][startCol+1] && isTrue[startRow+1][startCol]==true){
                startRow = startRow+1;
                collectedCoins++;
                matrix[startRow][startCol]--;
            }
            if(matrix[startRow][startCol-1]==0 && matrix[startRow][startCol+1]==0
                    && matrix[startRow-1][startCol]==0
                    && matrix[startRow+1][startCol]==0){
                break;
            }
        }
        System.out.println(collectedCoins);
    }
}
