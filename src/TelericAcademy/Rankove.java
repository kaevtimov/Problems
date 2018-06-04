package TelericAcademy;

import java.util.ArrayList;
import java.util.Scanner;

public class Rankove {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        scanner.nextLine();
        String[] input = scanner.nextLine().split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        for(int n = 0; n < input.length; n++) {
            list.add(Integer.MIN_VALUE);
        }
        int[] numbers = new int[input.length];
        for(int n = 0; n < input.length; n++) {
            numbers[n] = Integer.parseInt(input[n]);
        }

        int counter = numbers.length;
        int index = 0;
        int counter1 = 1;
        while(counter>0){
            int biggestNum = Integer.MIN_VALUE;
            for (int i = 0; i < numbers.length; i++) {
                if(numbers[i]>biggestNum){
                    biggestNum=numbers[i];
                    index = i;
                }
            }
            numbers[index] = Integer.MIN_VALUE+counter;
            list.remove(index);
            list.add(index, counter1);
            counter1++;
            counter--;
        }
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            str.append(list.get(i) + " ");
        }
        System.out.println(str);
    }
}
