package TelericAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordSearch {

    public static char[][] matrix;
    public static String word;
    public static boolean[][] isFull;
    public static int counter = 0;
    public static boolean match = false;
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        word = in.readLine();
        matrix = new char[][]{{'A', 'B', 'C', 'E'},
                              {'S', 'F', 'C', 'S'},
                              {'A', 'D', 'E', 'E'}};
        isFull = new boolean[matrix.length][matrix[0].length];
        solve(0,0, 0);
        System.out.println(match);
    }
    public static void solve(int row, int col, int index){
        if(row<0 || col<0){return;}
        if(row>=matrix.length || col >= matrix[0].length || isFull[row][col]==true){
            return;
        }
        if(index>=word.length()){
            match = true;
        }
        else{
            counter++;
            for (int r = row; r < matrix.length; r++) {
                for (int c = col; c < matrix[0].length; c++) {
                    char ch = word.charAt(index);
                    if(matrix[r][c]==ch && isFull[r][c]==false){
                        isFull[r][c]=true;
                        solve(r-1, c, index+1);
                        solve(r, c+1, index+1);
                        solve(r+1, c, index+1);
                        solve(r, c-1, index+1);
                        isFull[r][c]=false;
                    }else if(matrix[r][c]!=ch && counter>1){
                        return;
                    }
                }
            }
        }
    }
}
