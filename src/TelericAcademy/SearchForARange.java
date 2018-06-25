package TelericAcademy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class SearchForARange {

    public static HashSet<Integer> list = new HashSet<>();
    public static ArrayList<Integer> finalList = new ArrayList<>();
    public static int number = 0;
    public static int numIndex = -1;
    public static int counter = 0;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int targetSum = scanner.nextInt();
        scanner.nextLine();
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        solve(numbers, targetSum, 0);
        if(counter==0){
            System.out.println("[-1, -1]");
        }else{
            Object[] numbersFinal = list.toArray();
            finalList.add((Integer) numbersFinal[0]);
            finalList.add((Integer) numbersFinal[numbersFinal.length-1]);
            System.out.println(finalList);
        }
    }
    public static void solve(int[] numbers, int target, int index){
        if(index==numbers.length){
            return;
        }
        if(number==target){
            list.add(numIndex);
            counter++;
        }
        for (int i = index; i < numbers.length; i++) {
            number = numbers[i];
            numIndex = i;
            solve(numbers,target,index+1);
        }
    }
}
