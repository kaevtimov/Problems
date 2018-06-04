package Recursion;

public class Recurssion3 {
    public static void main(String[] args){
        String string = "Hello, Kiki!";
        System.out.println(reverseString(string));
    }
    private static String reverseString(String str){
        if(str.length()<2){
            return str;
        }
        return reverseString(str.substring(1))+str.charAt(0);
    }
}
