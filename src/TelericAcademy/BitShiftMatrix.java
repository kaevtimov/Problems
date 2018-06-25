package TelericAcademy;

import java.math.BigInteger;
import java.util.Scanner;

public class BitShiftMatrix {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int n = scanner.nextInt();
        int[] cells = new int[n];
        for (int i = 0; i < n; i++) {
            cells[i] = scanner.nextInt();
        }

        BigInteger[] powsTwo = new BigInteger[row+col-1];
        BigInteger powTwo = BigInteger.valueOf(1);
        for (int i = 0; i < row+col-1; i++) {
            powsTwo[i] = powTwo;
            powTwo = powTwo.multiply(BigInteger.valueOf(2));
        }

        boolean[][] matrix = new boolean[row][col];
        int coef = Math.max(row,col);
        int currentRow = row-1;
        int currentCol = 0;
        BigInteger result = BigInteger.valueOf(0);

        for (int cell : cells) {
            int targetR = cell/coef;
            int targetC = cell % coef;

            int horizontalDirection;
            if(currentCol<=targetC){
                horizontalDirection = 1;
            }else{
                horizontalDirection = -1;
            }
            int verticalDirection;
            if(currentRow<=targetR){
                verticalDirection = 1;
            }else{
                verticalDirection = -1;
            }
            while(currentCol!=targetC || currentRow!=targetR){
                if(!matrix[currentRow][currentCol]){
                    matrix[currentRow][currentCol]=true;
                    int pow = row-currentRow+currentCol-1;
                    result = result.add(powsTwo[pow]);
                }
                if(currentCol!=targetC){
                    currentCol+=horizontalDirection;
                    continue;
                }
                if(currentRow!=targetR){
                    currentRow += verticalDirection;
                }
            }

        }
        if(!matrix[currentRow][currentCol]){
            matrix[currentRow][currentCol]=true;
            int pow = row-currentRow+currentCol-1;
            result = result.add(powsTwo[pow]);
        }
        System.out.println(result);
    }
}
