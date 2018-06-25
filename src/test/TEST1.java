package test;

import java.util.Arrays;
import java.util.Scanner;

public class TEST1 {
    public static int[] counter = new int[10];
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();

        numerology(number);
        System.out.println(Arrays.toString(counter));
    }

    public static void numerology(String string){
        System.out.println(string);
        if(string.length()==1){
            int last = string.charAt(0)-'0';
            counter[last]++;
        }
        else{
            for (int i = 0; i < string.length()-1; i++) {
                int letter1 = string.charAt(i)-'0';
                int letter2 = string.charAt(i+1)-'0';
                int result = formula(letter1, letter2);
                string = string.substring(0, i) + result + string.substring(i+2, string.length());
                numerology(string);
                string = string.substring(0, i)+letter1+letter2+string.substring(i+1, string.length());
            }return;
        }
    }
    public static int formula(int a, int b){
        int result = (a+b*(a^b))%10;
        return result;
    }
}