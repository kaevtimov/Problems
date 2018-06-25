package test;

import java.util.Scanner;


public class TraillingZeroes{
    private static int zeros = 0;
    public static void main(String args[]) {
        Scanner scanner = new Scanner( System.in );
        int number = scanner.nextInt();
        System.out.println(zeros(number));
    }
    static int zeros(int n) {
        for (int i = 5; n / i >= 1; i *= 5)
            zeros += n / i;
        return zeros;
    }
}
