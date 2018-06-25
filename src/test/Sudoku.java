package test;

public class Sudoku {
    public static char[][] sudoku;
    public static void main(String[] args){
        char[][] sudoku ={{'5', '3', '-', '-', '7', '-', '-', '-', '-'},
                          {'6', '-', '-', '1', '9', '5', '-', '-', '-'},
                          {'-', '9', '8', '-', '-', '-', '-', '6', '-'},
                          {'8', '-', '-', '-', '6', '-', '-', '-', '3'},
                          {'4', '-', '-', '8', '-', '3', '-', '-', '1'},
                          {'7', '-', '-', '-', '2', '-', '-', '-', '6'},
                          {'-', '6', '-', '-', '-', '-', '2', '8', '-'},
                          {'-', '-', '-', '4', '1', '9', '-', '-', '5'},
                          {'-', '-', '-', '-', '8', '-', '-', '7', '9'}};
        solveSudoku(0,0,sudoku);
    }
    public static void solveSudoku(int row, int col, char[][] matrix){
        printSudoku(matrix);
        System.out.println();
        System.out.println();
        if(col>=9){
            row++;
            col=0;
        }
        if(row==8 && col==9){
            printSudoku(matrix);
            System.out.println();
        }
        for (int r = row; r < 9; r++) {
            for (int c = col; c < 9; c++) {
                if(matrix[r][c]!='-'){
                    col=c+1;
                    continue;
                }else if (matrix[r][c]=='-'){
                    for (int k = 1; k <= 9; k++) {
                        char ch =  (char)(k + '0');
                        boolean isFull = false;
                        for (int i = 0; i < 9; i++) {            // tuk proverqvame kolonite i redovete
                            if(matrix[r][i]==ch || matrix[i][c]==ch){
                                isFull=true;
                                break;
                            }
                        }
                        if(isFull==false && check3x3(matrix, r, c, ch)==true){    // tova e metoda koito proverqva otdelnite 3x3 sektori
                            matrix[r][c]=ch;
                            solveSudoku(row, col+1, matrix);
                            continue;
                        }else{
                            continue;
                        }
                    }
                    matrix[r][c]='-';
                    return;
                }
            }
        }
    }

    private static boolean check3x3(char[][] matrix, int row, int col, char number) {
        int rowStart = (row / 3) * 3;
        int rowEnd = rowStart + 3;
        int colStart = (col / 3) * 3;
        int colEnd = colStart + 3;

        for (int r = rowStart; r < rowEnd; r++) {
            for (int c = colStart; c < colEnd; c++) {
                if (matrix[r][c]==number){
                    return false;
                }
            }
        }
        return true;
    }

    public static void printSudoku(char[][] matrix){
        for (int r = 0; r < 9; r++) {
            System.out.println();
            for (int c = 0; c < 9; c++) {
                System.out.print(matrix[r][c]);
            }
        }
    }
}
