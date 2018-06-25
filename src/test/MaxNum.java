package test;
import com.sun.deploy.util.StringUtils;

import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char[][] sudoku ={{'5', '3', '-', '-', '7', '-', '-', '-', '-'},
                          {'6', '-', '-', '1', '9', '5', '-', '-', '-'},
                          {'-', '9', '8', '-', '-', '-', '-', '6', '-'},
                          {'8', '-', '-', '-', '6', '-', '-', '-', '3'},
                          {'4', '-', '-', '8', '-', '3', '-', '-', '1'},
                          {'7', '-', '-', '-', '2', '-', '-', '-', '6'},
                          {'-', '6', '-', '-', '-', '-', '2', '8', '-'},
                          {'-', '-', '-', '4', '1', '9', '-', '-', '5'},
                          {'-', '-', '-', '-', '8', '-', '-', '7', '9'}};

        check3x3(sudoku,5, 5, '4');



    }private static boolean check3x3(char[][] board, int row, int col, char number) {
        //int rowStart = (row / 3) * 3;
        int rowEnd = row + 3;

        //int columnStart = (col / 3) * 3;
        int columnEnd = col + 3;

        for (int r = row; r < rowEnd; r++) {
            for (int c = col; c < columnEnd; c++) {
                if (board[r][c]==number){
                    return false;
                }
            }
        }
        return true;
    }
}