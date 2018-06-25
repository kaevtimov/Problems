package TelericAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HorseMatrix {
    public static char[][] chessBoard;
    public static boolean[][] check;
    public static int counter = 0;
    public static int bestPath = 0;
    public static int N;
    public static int ROW;
    public static int COL;
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());
        chessBoard = new char[N][N];
        check = new boolean[N][N];

        for (int row = 0; row < chessBoard.length; row++) {
            String characters = in.readLine();
            for (int col = 0; col < chessBoard[0].length; col++) {
                String[] chars = characters.split(" ");
                char ch = chars[col].charAt(0);
                chessBoard[row][col]=ch;
                if(chessBoard[row][col]=='s'){
                    ROW = row;
                    COL = col;
                }
            }
        }

        playHorseMatrix(ROW,COL, chessBoard);
        if(bestPath>0){
            System.out.println(bestPath);
        }else{
            System.out.println("No");
        }


    }public static void playHorseMatrix(int row, int col, char[][] board){
        if(row<0 || col <0){
            return;
        }
        if(row>=board.length || col>=board[0].length || check[row][col]==true || board[row][col]=='x'){
            return;
        }
        if(check[row][col]==false && (board[row][col]=='-' || board[row][col]=='s')){
            check[row][col] = true;
            counter++;
        }
        if(board[row][col]=='e'){
            if(counter>bestPath){
                bestPath = counter;
            }
            counter--;
            return;
        }else{
            playHorseMatrix(row-2, col-1, board);
            playHorseMatrix(row-2, col+1, board);
            playHorseMatrix(row-1, col+2, board);
            playHorseMatrix(row+1, col+2, board);
            playHorseMatrix(row+2, col+1, board);
            playHorseMatrix(row+2, col-1, board);
            playHorseMatrix(row+1, col-2, board);
            playHorseMatrix(row-1, col-2, board);
            counter--;
            check[row][col]=false;
            return;
        }
    }
//    public static void printBoard(char[][] board){
//        for (int i = 0; i < board.length; i++) {
//            System.out.println();
//            for (int j = 0; j < board[0].length; j++) {
//                System.out.print(board[i][j] + " ");
//            }
//        }
//    }
}
