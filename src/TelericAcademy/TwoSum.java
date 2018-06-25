package TelericAcademy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static int currentSum = 0;
    public static ArrayList<Integer> finalResult = new ArrayList<>();
    public static ArrayList<Integer> list = new ArrayList<>();           // dvete chisla
    public static ArrayList<Integer> unsorted = new ArrayList<>();        // nesortirani chisla
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int targetSum = scanner.nextInt();
        scanner.nextLine();
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int i = 0; i < numbers.length; i++) {
            unsorted.add(numbers[i]);
        }
        Arrays.sort(numbers);

        solve(numbers, targetSum);
        System.out.println(finalResult);
    }
    public static void solve(int[] numbers, int targetSum){
        int right = numbers.length-1;
        int left = 0;
        while(left<right){
            if(numbers[left] + numbers[right] == targetSum){
                list.add(numbers[left]);
                list.add(numbers[right]);
                for (int i = 0; i < unsorted.size(); i++) {
                    for (int j = 0; j < list.size(); j++) {
                        if(unsorted.get(i)==list.get(j)){
                            finalResult.add(i);
                        }
                    }
                }
                break;
            }else if(numbers[left] + numbers[right] < targetSum){
                left++;
            }else{
                right--;
            }
        }
    }
}

