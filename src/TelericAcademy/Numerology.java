package TelericAcademy;

import java.util.ArrayList;
import java.util.Scanner;

public class Numerology {                         // list
    public static int[] counter = new int[10];
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        char[] numbers = number.toCharArray();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            list.add(numbers[i]-'0');
        }

        numerology(list);
        printNumerology(counter);

    }

    public static void numerology(ArrayList list){
        if(list.size()==1){
            int last = (int)list.get(0);
            counter[last]++;
            return;
        }
        else{
            for (int i = 0; i < list.size()-1; i++) {
                int letter1 = (int)list.get(i);
                int letter2 = (int)list.get(i+1);
                int result = formula(letter1, letter2);
                list.remove(i);
                list.remove(i);
                list.add(i, result);
                numerology(list);
                list.set(i, letter1);
                list.add(i+1, letter2);
            }
        }
    }
    public static int formula(int a, int b){
        int result = (a+b)*(a^b)%10;
        return result;
    }
    public static void printNumerology(int[] results){
        for (int i = 0; i < results.length; i++) {
            System.out.print(results[i] + " ");
        }
    }
}
