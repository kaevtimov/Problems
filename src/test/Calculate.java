package test;

import java.math.BigDecimal;
import java.util.Scanner;

public class Calculate {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double N = scanner.nextDouble();
        double x = scanner.nextDouble();
        BigDecimal S = BigDecimal.valueOf(1 + 1/x + (1*2)/(x*x));

        for (int i = 3; i <= N; i++) {
            S = S.add(BigDecimal.valueOf(fact(i)/(Math.pow(x, i))));
        }
        System.out.printf("%.5f", S);
    }
    public static long fact(int n){
        long fact = 1;
        for(int i=1;i<=n;i++) {
            fact *= i;
        }
        return fact;
    }
}
