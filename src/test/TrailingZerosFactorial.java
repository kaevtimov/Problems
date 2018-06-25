package test;

import java.math.BigInteger;
import java.util.Scanner;


public class TrailingZerosFactorial{
    public static void main(String args[]) {
        Scanner scanner = new Scanner( System.in );
        int number = scanner.nextInt();
        BigInteger fact = new BigInteger("1");
        int zeros = 0;
        for(int i=1;i<=number;i++){
            fact=fact.multiply(new BigInteger((i + "")));
        }
        String numb = fact.toString();
        for (int i = numb.length()-1; i >= 0; i--) {
            char ch = numb.charAt(i);
            if(ch=='0'){
                zeros++;
            }else{
                break;
            }
        }
        System.out.println(zeros);
    }
}
