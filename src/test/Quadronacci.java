package test;

import java.math.BigInteger;
import java.util.Scanner;

public class Quadronacci {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        BigInteger number1 = scanner.nextBigInteger();
        BigInteger number2 = scanner.nextBigInteger();
        BigInteger number3 = scanner.nextBigInteger();
        BigInteger number4 = scanner.nextBigInteger();
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        BigInteger[][] quad = new BigInteger[row][col];
        BigInteger[] numbers = new BigInteger[row*col];
        int counter = 1;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=quadronacci(counter,number1,number2,number3,number4);
            counter++;
        }
        counter=0;
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                quad[r][c]=numbers[counter];
                counter++;
            }
        }
        for (int r = 0; r < row; r++) {
            System.out.println();
            for (int c = 0; c < col; c++) {
                System.out.print(quad[r][c] + " ");
            }
        }
    }
    private static BigInteger quadronacci(int n, BigInteger num1, BigInteger num2, BigInteger num3, BigInteger num4){
        BigInteger first = num1;
        BigInteger second = num2;
        BigInteger third = num3;
        BigInteger fourth = num4;
        BigInteger quadro = BigInteger.valueOf(0);

        if(n==1){
            return num1;
        }else if(n==2){
            return num2;
        }else if(n==3){
            return num3;
        }else if(n==4){
            return num4;
        }

        for (int i = 4; i < n; i++) {
            quadro = first.add(second).add(third).add(fourth);
            first=second;
            second=third;
            third=fourth;
            fourth=quadro;
        }
        return quadro;
    }
}
