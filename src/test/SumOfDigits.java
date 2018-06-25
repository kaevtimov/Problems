package test;

import java.util.Scanner;
// subirame sumata na cifrite v chislo i ako sumata e > 9 povtarqme
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String number = in.nextLine();
        int sum = 0;
        for(int i = 0; i < number.length(); i ++) {
            char ch = number.charAt(i);
            if(Character.isDigit(ch)) {            // tva isDigit() izkliuchva i "-" i "."
                sum += ch - '0';
            }
        }

        while(sum > 9) {
            int newSum = 0;

            while(sum > 0) {            // eto tova e osnovnata formula za namirane na sumata ot cifrite na chislo
                newSum += sum % 10;
                sum /= 10;
            }

            sum = newSum;
        }

        System.out.println(sum);
    }
}