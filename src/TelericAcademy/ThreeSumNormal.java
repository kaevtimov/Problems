package TelericAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class ThreeSumNormal {
    public static int sum = 0;
    public static ArrayList<ArrayList<Integer>> finalList = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int wantedSum = Integer.parseInt(in.readLine());
        int[] numbers = Arrays.stream(in.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                for (int k = j+1; k < numbers.length; k++) {
                    sum = numbers[i] + numbers[j] + numbers[k];
                    ArrayList<Integer> list = new ArrayList<>();
                    if(sum==wantedSum){
                        list.add(numbers[i]);
                        list.add(numbers[j]);
                        list.add(numbers[k]);
                        list.sort(Comparator.naturalOrder());
                        if(!finalList.contains(list)){
                            finalList.add(list);
                        }
                    }
                }
            }
        }
        System.out.println(finalList);
    }
}
