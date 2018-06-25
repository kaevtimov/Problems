import java.util.Scanner;

public class LongestSeqMatrix {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int bestResult = 1;
        int bestCol = 1;
        int bestRow = 1;
        int bestDiagonal = 1;


        String[] rowCol = scanner.nextLine().split(" ");
        int N = Integer.parseInt(rowCol[0]);
        int M = Integer.parseInt(rowCol[1]);

        int[][] matrix = new int[N][M];

        for(int row = 0; row < matrix.length; row++) {
            String numbers = scanner.nextLine();
            for (int col = 0; col < matrix[0].length; col++) {
                String[] digits = numbers.split(" ");
                int number = Integer.parseInt(digits[col]);
                matrix[row][col]=number;
            }
        }


        for (int row = 0; row < matrix.length-1; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                bestCol = 1;
                bestRow = 1;
                bestDiagonal = 1;
                int currentRow = row;
                while(currentRow < matrix.length-1){
                    if(matrix[currentRow][col]==matrix[currentRow+1][col]){
                        currentRow++;
                        bestRow++;
                    }else{
                        break;
                    }
                }
                if(bestRow>bestResult){
                    bestResult = bestRow;
                }
                int currentCol = col;
                while(currentCol < matrix[0].length-1){
                    if(matrix[row][currentCol]==matrix[row][currentCol+1]){
                        bestCol++;
                        currentCol++;
                    }else {
                        break;
                    }
                }
                if(bestCol>bestResult){
                    bestResult = bestCol;
                }
                currentCol = col;
                currentRow = row;
                while(currentRow < matrix.length-1){
                    if(currentCol == matrix[0].length-1 || currentRow == matrix.length-1){
                        break;
                    }
                    if(matrix[currentRow][currentCol] == matrix[currentRow+1][currentCol+1]){
                        bestDiagonal++;
                        currentCol++;
                        currentRow++;
                    }else{
                        break;
                    }
                }
                if(bestDiagonal > bestResult){
                    bestResult = bestDiagonal;
                }
                bestDiagonal = 1;
                currentCol = col;
                currentRow = row;
                while(currentCol > 0 && currentRow < matrix.length-1){
                    if(currentCol == 0){
                        break;
                    }
                    if(matrix[currentRow][currentCol] == matrix[currentRow+1][currentCol-1]){
                        bestDiagonal++;
                        currentRow++;
                        currentCol--;
                    }else{
                        break;
                    }
                }
                if(bestDiagonal > bestResult){
                    bestResult = bestDiagonal;
                }
            }
        }

        System.out.println(bestResult);
    }
}
