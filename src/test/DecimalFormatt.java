package test;

import java.util.Scanner;
import java.text.DecimalFormat;

public class DecimalFormatt {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        DecimalFormat format = new DecimalFormat("0.#"); // System.out.println(format.format(price));
        String A = format.format(a);
        String B = format.format(b);
        String C = format.format(c);

        if(a<b+c && b<a+c && c<a+b){
            if(a != b && a != c && b != c){
                System.out.printf("Triangle with sides %s, %s and %s is scalene.", A, B, C);
            } else if((a == b && a!=c) || (a == c && a != b) || (b == c && b != a)){
                System.out.printf("Triangle with sides %s, %s and %s is isosceles.", A, B, C);
            } else if(a == b && a == c && b == c){
                System.out.printf("Triangle with sides %s, %s and %s is equilateral.", A, B, C);
            }
        } else{
            System.out.printf("There is no triangle with sides %s, %s and %s.", A, B, C);
        }
    }
}
