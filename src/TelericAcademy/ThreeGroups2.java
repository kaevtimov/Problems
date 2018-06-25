package TelericAcademy;

import java.util.ArrayList;
import java.util.Scanner;

public class ThreeGroups2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String array = scanner.nextLine();
        String[] numbers = array.split(" ");

        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list0 = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            int num = Integer.parseInt(numbers[i]);
            if(num%3==0){
                list0.add(num);
            }else if(num%3==1){
                list1.add(num);
            }else if(num%3==2){
                list2.add(num);
            }
        }
        list.add(list0);
        list.add(list1);
        list.add(list2);
        for (ArrayList<Integer> finalList : list) {
            for (Integer i : finalList) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
