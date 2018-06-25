package TelericAcademy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Brackets {
    public static int n;
    //public static ArrayList<String> list = new ArrayList<>();       // moje i s ArrayList
    public static HashSet<String> list = new HashSet<>();             // moje i s HashSet, zahsoto toi pazi samo nepovtarqshtite se
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        String br = "";
        System.out.print(brackets(br, n));
        list.forEach(System.out::println);
    }public static String brackets(String bracket, int number){
        if(bracket.length()==number){
            list.add(bracket);
            return bracket;
        }else{
            brackets("()" + bracket, number);
            brackets("(" + bracket + ")", number);
            brackets(bracket+"()", number);
        }
        return bracket;
    }
}
