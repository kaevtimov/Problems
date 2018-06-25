package TelericAcademy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SameArrays {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        scanner.nextLine();
        String[] parts = scanner.nextLine().split(" ");
        ArrayList<Integer> numbers1 = new ArrayList<>();
        for(int n = 0; n < parts.length; n++) {
            int number = Integer.parseInt(parts[n]);
            if(!numbers1.contains(number)){
                numbers1.add(Integer.parseInt(parts[n]));
            }
        }
        int m = scanner.nextInt();
        scanner.nextLine();
        String[] parts1 = scanner.nextLine().split(" ");
        ArrayList<Integer> numbers2 = new ArrayList<>();
        for(int n = 0; n < parts1.length; n++) {
            int number = Integer.parseInt(parts1[n]);
            if(!numbers2.contains(number)){
                numbers2.add(Integer.parseInt(parts1[n]));
            }
        }

        boolean isSame = true;
        ArrayList<Integer> finalList = new ArrayList<>();
        for (int i = 0; i < numbers1.size(); i++) {
            if(!numbers2.contains(numbers1.get(i))){
                isSame=false;
                finalList.add(numbers1.get(i));
            }
        }
        if(isSame==true){
            System.out.println(numbers2.size());
        }else{
            Collections.sort(finalList);
            for (int i = 0; i < finalList.size(); i++) {
                System.out.print(finalList.get(i) + " ");
            }
        }
    }
}
