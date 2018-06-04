package Recursion;

import java.util.Scanner;

public class EndX {
    private static int sum = 0;
    private static StringBuilder strb = new StringBuilder();
    private static boolean isTrue = false;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(endX(str));
    }

    private static String endX(String string) {
        if(string.length()==0){
            return string;
        }else{
            if(string.charAt(0)=='x') {
                string = string.substring(1) + string.charAt(0);
                return endX(string.substring(0, string.length()-1)) + string.charAt(string.length()-1);
            }else{
                return string.charAt(0) + endX(string.substring(1, string.length()));
            }
        }
    }
}
