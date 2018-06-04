package Recursion;

public class EightQueen {
    private static char[][] matrix = {
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
    };
    private static char UNPASSABLE = 'Q';
    //private static char CHECK = 'X';
    private static int checked = 0;
    private static int count = 0;
    private static boolean isFull = false;
    public static void main(String[] args){
        mainCheck(0, 0);
    }
    public static void mainCheck(int roww, int coll){
        //matrix[roww][coll]=UNPASSABLE;
        //count++;
        for (int row = 0; row < matrix.length; row++) {
            if(count==8){
                PrintPath();
                break;
            }
            for (int col = 0; col < matrix[0].length; col++) {
                FindPaths(row, col);
            }if(count!=8){
                return;
            }
        }
//        if(count!=8){
//            return;
//            for (int row = 0; row < matrix.length;row++) {
//                for (int col = 0; col < matrix[0].length; col++) {
//                    if(matrix[row][col]==UNPASSABLE){
//                        matrix[row][col]=' ';
//                    }
//                }
//            }
        //matrix[checked][0]=CHECK;
//            count=0;
        //checked++;
//            mainCheck(roww, col1, 0, col1+1);
//            mainCheck(roww+1, 0, row1+1, col1);
        //}
    }

    private static void FindPaths(int row, int col) {
        isFull=false;
        if (row < 0 || row >= matrix.length || col < 0 || col >= matrix[0].length) {
            return;
        }
        if (matrix[row][col] == UNPASSABLE){
            return;
        }
        MarkCurrent(row, col);
        CheckPath(row+1, col+1);
        CheckPath1(row-1, col-1);
        CheckPath2(row-1, col+1);
        CheckPath3(row+1, col-1);
        CheckPath4(row+1, col);
        CheckPath5(row, col+1);
        CheckPath6(row-1, col);
        CheckPath7(row, col-1);
        if(isFull){
            UnmarkCurrent(row, col);
            return;
        }else{
            count++;
            return;
        }
    }

    private static void CheckPath7(int row, int col) {
        if (row < 0 || row >= matrix.length || col < 0 || col >= matrix[0].length) {
            return;
        }
        if (matrix[row][col] == UNPASSABLE){
            isFull=true;
        }else{
            CheckPath7(row, col-1);
        }
    }
    private static void CheckPath6(int row, int col) {
        if (row < 0 || row >= matrix.length || col < 0 || col >= matrix[0].length) {
            return;
        }
        if (matrix[row][col] == UNPASSABLE){
            isFull=true;
        }else{
            CheckPath6(row-1, col);
        }
    }
    private static void CheckPath5(int row, int col) {
        if (row < 0 || row >= matrix.length || col < 0 || col >= matrix[0].length) {
            return;
        }
        if (matrix[row][col] == UNPASSABLE){
            isFull=true;
        }else{
            CheckPath5(row, col+1);
        }
    }
    private static void CheckPath4(int row, int col) {
        if (row < 0 || row >= matrix.length || col < 0 || col >= matrix[0].length) {
            return;
        }
        if (matrix[row][col] == UNPASSABLE){
            isFull=true;
        }else{
            CheckPath4(row+1, col);
        }
    }
    private static void CheckPath3(int row, int col) {
        if (row < 0 || row >= matrix.length || col < 0 || col >= matrix[0].length) {
            return;
        }
        if (matrix[row][col] == UNPASSABLE){
            isFull=true;
        }else{
            CheckPath3(row+1, col-1);
        }
    }
    private static void CheckPath2(int row, int col) {
        if (row < 0 || row >= matrix.length || col < 0 || col >= matrix[0].length) {
            return;
        }
        if (matrix[row][col] == UNPASSABLE){
            isFull=true;
        }else{
            CheckPath2(row-1, col+1);
        }
    }
    private static void CheckPath1(int row, int col) {
        if (row < 0 || row >= matrix.length || col < 0 || col >= matrix[0].length) {
            return;
        }
        if (matrix[row][col] == UNPASSABLE){
            isFull=true;
        }else{
            CheckPath1(row-1, col-1);
        }
    }

    private static void CheckPath(int row, int col) {
        if (row < 0 || row >= matrix.length || col < 0 || col >= matrix[0].length) {
            return;
        }
        if (matrix[row][col] == UNPASSABLE){
            isFull=true;
        }else{
            CheckPath(row+1, col+1);
        }
    }

    private static void PrintPath() {
        System.out.println("yes");
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
