package TelericAcademy;

import java.util.ArrayList;
import java.util.Scanner;

public class MergingAndSquashing {
    public static ArrayList<String> list1 = new ArrayList<>();
    public static ArrayList<String> list2 = new ArrayList<>();
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] numbers = new String[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextLine();
        }
        for (int i = 0; i < numbers.length-1; i++) {
            String number2 = numbers[i+1];
            String merged = numbers[i].charAt(numbers[i].length()-1) + "" + number2.charAt(0);
            list1.add(merged);
            int digit1 = Integer.parseInt(String.valueOf(numbers[i].charAt(numbers[i].length()-1)));
            int digit2 = Integer.parseInt(String.valueOf(number2.charAt(0)));
            int digit = (digit1+digit2)%10;
            String squashed = numbers[i].substring(0, numbers[i].length()-1) + "" + digit + number2.substring(1, number2.length());
            list2.add(squashed);
        }
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " ");
        }
        System.out.println();
        for (int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i) + " ");
        }
    }
}
