package test;

import java.util.Scanner;

public class HorsePath {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] chessBoard = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                chessBoard[i][j]=0;
            }
        }
        int row = 0;
        int col = 0;
        int step = 1;
        chessBoard[row][col] = step;

        while(step < n*n){
            step++;
            if(row-2>=0 && col-1>=0 && chessBoard[row-2][col-1]==0){
                row-=2;
                col-=1;
                chessBoard[row][col] = step;
            }else if(row-2>=0 && col+1<n && chessBoard[row-2][col+1]==0){
                row-=2;
                col++;
                chessBoard[row][col] = step;
            }else if(row-1>=0 && col-2>=0 && chessBoard[row-1][col-2]==0){
                row--;
                col-=2;
                chessBoard[row][col] = step;
            }else if(row-1>=0 && col+2<n && chessBoard[row-1][col+2]==0){
                row--;
                col+=2;
                chessBoard[row][col] = step;
            }else if(row+1<n && col-2>=0 && chessBoard[row+1][col-2]==0){
                row++;
                col-=2;
                chessBoard[row][col] = step;
            }else if(row+1<n && col+2<n && chessBoard[row+1][col+2]==0){
                row++;
                col+=2;
                chessBoard[row][col] = step;//
            }else if(row+2<n && col-1>=0 && chessBoard[row+2][col-1]==0){
                row+=2;
                col--;
                chessBoard[row][col] = step;
            }else if(row+2<n && col+1<n && chessBoard[row+2][col+1]==0){
                row+=2;
                col++;
                chessBoard[row][col] = step;
            }else{
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if(chessBoard[i][j]==0){
                            row=i;
                            col=j;
                            chessBoard[row][col] = step;
                            break;
                        }
                    }
                    if(chessBoard[row][col]==step){
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(chessBoard[i][j] + " ");
            }System.out.println();
        }
    }
}