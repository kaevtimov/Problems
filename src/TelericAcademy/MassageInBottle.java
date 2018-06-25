package TelericAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class MassageInBottle {
    public static ArrayList<Character> letter = new ArrayList<Character>();
    public static ArrayList<String> list = new ArrayList<>();
    public static ArrayList<String> finalList = new ArrayList<>();
    public static String[] cifre1;
    public static int counter = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String code = in.readLine();
        String cifre = in.readLine();
        for (int i = 0; i < cifre.length(); i++) {
            char ch = cifre.charAt(i);
            if(!Character.isDigit(ch)){
                cifre = cifre.replace(ch, ' ');
                letter.add(ch);
            }
        }
        cifre1 = cifre.split(" ");

        solveString(code, list);
        finalList.sort(Comparator.naturalOrder());

        if(counter==0){
            System.out.println(0);
        }else{
            System.out.println(counter);
            for (int i = 0; i < finalList.size(); i++) {
                System.out.println(finalList.get(i));
            }
        }

    }
    public static void solveString(String string, ArrayList list){
        if(string.length()==0){
            StringBuilder stringFinal = new StringBuilder();
            for (int i = 0; i < list.size(); i++) {
                for (int j = 1; j < cifre1.length; j++) {
                    if(list.get(i).equals(cifre1[j])){
                        stringFinal.append(letter.get(j-1));
                    }
                }
            }
            if(stringFinal.length()==list.size()){
                counter++;
                finalList.add(stringFinal.toString());
            }
        }else{
            for (int i = 0; i < string.length(); i++) {
                list.add(string.substring(0, i+1));

                solveString(string.substring(i+1), list);

                list.remove(list.size()-1);
            }
        }
    }
}
