package TelericAcademy;

import java.util.ArrayList;
import java.util.Scanner;

public class SendMeTheCode {
    public static int result = 0;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        string = string. replaceAll("-", "");

        String str = "";
        for (int i = string.length()-1; i >= 0; i--) {
            str += "" + string.charAt(i);
        }

        int[] numbers = new int[str.length()];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }

        ArrayList<Integer> list = new ArrayList<>();

        list.add(0);
        for (int i = 0; i < numbers.length; i++) {
            list.add(numbers[i]);
        }


        for (int i = list.size()-1; i >= 0; i--) {
            if(i%2!=0){
                result+= (Math.abs(list.get(i)) * Math.pow(i, 2));
            }else{
                result+= (Math.pow(Math.abs(list.get(i)), 2) * i);
            }
        }


        int lastDigit = result%10;
        int S = result%26;
        int start = S+1;
        char startChar = (char)(start+'A'-1);


        StringBuilder stringb = new StringBuilder();
        stringb.append(startChar);
        start++;
        for (int i = 0; i < lastDigit-1; i++) {
            if(start>26){
                start = 1;
                stringb.append((char)(start+'A'-1));
                start++;
            }else{
                stringb.append((char)(start+'A'-1));
                start++;
            }
        }


        if(lastDigit==0) {
            System.out.println(result);
            System.out.println("Big Vik wins again!");
        }else{
            System.out.println(result);
            System.out.println(stringb);
        }
    }
}