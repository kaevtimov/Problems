package TelericAcademy;

public class Sudoku2 {
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
        solveSudoku(sudoku, 0 ,0);
        //printSudoku(sudoku);
    }
    private static boolean solveSudoku(char[][] board, int row, int col) {
        for (int r = row; r < board.length; r++) {
            for (int c = col; c < board[0].length; c++) {
                if (board[r][c] == '-') {
                    for (int k = 1; k <= 9; k++) {
                        char ch =  (char)(k + '0');
                        board[r][c] = ch;
                        if (check3x3(board, r,c,ch) && checkRowCol(board, r, c, ch) && solveSudoku(board, r,c)) {
                            return true;
                        }
                        board[r][c] = '-';
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean check3x3(char[][] matrix, int row, int col, char number) {
        int rowStart = (row / 3) * 3;                                             // tuk proverqvame 3x3 kletkite
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
    public static boolean checkRowCol(char[][] matrix, int row, int col, char number){
        for (int i = 0; i < 9; i++) {                                            // tuk proverqvame kolonite i redovete
            if(matrix[row][i]== number || matrix[i][col]==number){
                return true;
            }
        }return false;
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

