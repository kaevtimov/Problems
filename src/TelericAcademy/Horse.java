package TelericAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Horse {

    public static int[][] chessBoard;
    public static boolean[][] check;
    public static int counter = 0;
    public static int N;
    public static int M;
    public static int V = 1;
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(in.readLine());
        int M = Integer.parseInt(in.readLine());
        int R = Integer.parseInt(in.readLine());
        int C = Integer.parseInt(in.readLine());

        chessBoard = new int[N][M];
        check = new boolean[N][M];
        chessBoard[R][C]=V;

        playHorse(R,C);


    }public static void playHorse(int row, int col){
        if(row<0 || col <0){
            return;
        }
        if(row>=chessBoard.length || col>=chessBoard[0].length || check[row][col]==true){
            return;
        }
        if(check[row][col]==false){
            counter++;
            chessBoard[row][col] = V;
            check[row][col] = true;
        }
        if(counter==N*M){
            //stop
        }else{
            V = chessBoard[row][col]+1;
            playHorse(row-2, col-1);
            playHorse(row-2, col+1);
            playHorse(row-1, col+2);
            playHorse(row+1, col+2);
            playHorse(row+2, col+1);
            playHorse(row+2, col-1);
            playHorse(row+1, col-2);
            playHorse(row-1, col-2);
        }
    }
}
