package Recursion;

import java.util.ArrayList;

public class Labyrinth {
    private static ArrayList<Character> path = new ArrayList<>();
    private static char[][] matrix = {
            {' ', ' ', ' ', 'x', ' ', ' ', ' '},
            {'x', 'x', ' ', 'x', ' ', 'x', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', 'x', 'x', 'x', 'x', 'x', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', 'e'},
    };
    private static char UNPASSABLE = 'O';
    public static void main(String[] args){
        FindPaths(0, 0, 's');
    }

    private static void FindPaths(int row, int col, char direction) {
        if (row < 0 || row >= matrix.length || col < 0 || col >= matrix[0].length) {
            return;
        }
        if (matrix[row][col] == UNPASSABLE || matrix[row][col] =='x'){
            return;
        }
        if (matrix[row][col] =='e'){
            PrintPath();
            return;
        }
        path.add(direction);
        MarkCurrent(row, col);
        FindPaths(row-1, col, 'U'); //up
        FindPaths(row+1, col, 'D'); //down
        FindPaths(row, col+1, 'R'); //right
        FindPaths(row, col-1, 'L'); //left
        UnmarkCurrent(row, col);
        path.remove(path.get(path.size()-1));

    }

    private static void PrintPath() {
        System.out.println(path);
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col] + "|");
            }
            System.out.println();
        }
    }

    private static void UnmarkCurrent(int row, int col) {
        matrix[row][col] = ' ';
    }

    private static void MarkCurrent(int row, int col) {
        matrix[row][col] = UNPASSABLE;
    }
}
