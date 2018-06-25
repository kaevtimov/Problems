package TelericAcademy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;  // above the main diagonal 1,2

public class Swappings {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        int[] swaps = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int k = 1; k <= N; k++) {
            list.add(k);
        }
        System.out.println(list);


        for (int i = 0; i < swaps.length; i++) {
            int index = 0;
            for (int j = 0; j < list.size(); j++) {
                if(list.get(j)==swaps[i]){
                    index=j;
                }
            }
            System.out.println(index);
            list1.clear();
            for (int j = index+1; j < list.size(); j++) {
                list1.add(list.get(j));
            }
            list1.add(list.get(index));
            for (int j = 0; j < index; j++) {
                list1.add(list.get(j));
            }
            System.out.println(list1);
            list.clear();
            for (int j = 0; j < list1.size(); j++) {
                list.add(list1.get(j));
            }
            System.out.println(list);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
