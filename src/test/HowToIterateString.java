package test;

import java.util.Scanner;

public class HowToIterateString {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int sum = 0;


        for (int j = 0; j < word.length(); j++) {
            switch (word.charAt(j)){
                case 'a':
                    sum+=1;
                    break;
                case 'e':
                    sum+=2;
                    break;
                case 'i':
                    sum+=3;
                    break;
                case 'o':
                    sum+=4;
                    break;
                case 'u':
                    sum+=5;
                    break;
            }
        }
        System.out.println(sum);
    }
}
