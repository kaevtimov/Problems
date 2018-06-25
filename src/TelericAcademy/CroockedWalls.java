package TelericAcademy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CroockedWalls {
    public static long result = 0;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long[] numbers = Arrays.stream(scanner.nextLine().split(" "))  // tuk si pazq stenite
                .mapToLong(Long::parseLong)
                .toArray();
        ArrayList<Long> list = new ArrayList<>();                    // tuk razlikata vuv visochinata

        for (int i = 0; i < numbers.length-1; i++) {
            long max = Math.max(numbers[i], numbers[i+1]);
            long min = Math.min(numbers[i], numbers[i+1]);
            long diff = max-min;
            diff = Math.abs(diff);
            list.add(diff);
        }
        boolean[] skipped = new boolean[list.size()];                // da pazim skipnatite chisla
        skipped[0] = true;


        for (int i = 0; i < list.size()-1; i++) {
            if(list.get(i)%2!=0){
                skipped[i+1]=true;
            }else{
                if(i+2<list.size()){
                    skipped[i+2] = true;
                    i+=1;
                }
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)%2==0 && skipped[i]==true){
                result+=list.get(i);
            }
        }
//        System.out.println(list);
//        System.out.println(Arrays.toString(skipped));
        System.out.println(result);
    }
}
