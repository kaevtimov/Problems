package test;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class WhiteSpaceRemove {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        String word = scanner.nextLine();

        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length-1; i++) {
            if(chars[i]==chars[i+1]){
                chars[i]=' ';
            }
        }
        String text = String.valueOf(chars);
        System.out.println(text.replaceAll("\\s+",""));
    }
}

