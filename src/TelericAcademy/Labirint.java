package TelericAcademy;

import java.util.Scanner;

public class Labirint {
    public static char[][] labyrinth;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char[][]labyrinth = {{'X', 'X', ' ', ' ', 'S'},
                             {' ', ' ', ' ', 'X', ' '},
                             {' ', 'X', ' ', 'X', ' '},
                             {' ', 'X', ' ', ' ', ' '},
                             {' ', 'E', ' ', 'X', 'X'},
        };
        int row = 0;
        int col = 0;
        for (int r = 0; r < labyrinth.length; r++) {
            for (int c = 0; c < labyrinth[0].length; c++) {
                if(labyrinth[r][c]=='S'){
                    row=r;
                    col=c;
                }
            }
        }
        path(row,col, labyrinth);
    }public static void path(int row, int col, char[][] matrix){
        if(row<0 || col<0){
            return;
        }
        if(row>=matrix.length || col>=matrix[0].length || matrix[row][col]=='X'
                || matrix[row][col]=='o' ||  matrix[row][col] == 's'){
            return;
        }
        if(matrix[row][col]=='E'){
            print(matrix);
            System.out.println();
        }
        else{
            mark(row,col,matrix);
            path(row,col+1, matrix);  // nadqsno
            path(row+1, col, matrix);  // nadolu
            path(row,col-1, matrix);   //nalqvo
            path(row-1,col, matrix);  //nagore
            unmark(row,col,matrix);
        }
    }
    public static void print(char[][] path){
        for (int r = 0; r < path.length; r++) {
            System.out.println();
            for (int c = 0; c < path[0].length; c++) {
                System.out.print(path[r][c] + "|");
            }
        }
    }
    public static void mark(int row, int col, char[][] matrix){
        if(matrix[row][col]!='S'){
            matrix[row][col] = 'o';
        }else{
            matrix[row][col] = 's';
        }
    }
    public static void unmark(int row, int col, char[][] matrix){
        matrix[row][col] = ' ';
    }
}
