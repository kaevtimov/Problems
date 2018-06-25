package TelericAcademy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Zadacha1 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(); //tova sa mi podredeni chisla ot 1-N
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> finalList = new ArrayList<>();


        int[] numbers = Arrays.stream(scanner.nextLine().split(","))  // tova sa mi dadenite
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 1; i <= numbers.length; i++) {
            list.add(i);
            list1.add(numbers[i-1]);
        }

        for (int i = 0; i < list1.size(); i++) {
            if(!list1.contains(list.get(i))){
                finalList.add(list.get(i));
            }
        }

        StringBuilder str = new StringBuilder();
        if(finalList.size()==1){
            System.out.println(finalList.get(0));
        }else if(finalList.size()==0){
            System.out.println();
        }else{
            for (int i = 0; i < finalList.size(); i++) {
                str.append(finalList.get(i) + ",");
            }
            str.deleteCharAt(str.length()-1);
            System.out.println(str);
        }
    }
}
