package test;

import java.util.Scanner;

public class CroockedDigits {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        long sum =0;
        for (int i = 0; i < number.length(); i++) {
            char ch = number.charAt(i);
            if(Character.isDigit(ch)){
                sum+=ch-'0';
            }
        }
        while (sum > 9) {
            long sum1 = 0;
            while(sum>0){
                sum1+= sum % 10;
                sum /= 10;
            }
            sum = sum1;
        }
        System.out.println(sum);
    }
}
