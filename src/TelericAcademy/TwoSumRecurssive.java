package TelericAcademy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class TwoSumRecurssive {
    public static HashSet<Integer> list = new HashSet<>();          // tuk zapazvam dvete chisla za da ne se povtarqt
    public static ArrayList<Integer> finalResult = new ArrayList<>();       // tova e finalniq list s dvata indexa
    public static int numberOne = 0;
    public static int numberTwo = 0;
    public static int sum = 0;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int targetSum = scanner.nextInt();
        scanner.nextLine();
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        solve(numbers, targetSum, 0, 0);
        Object[] numbersFinal = list.toArray();                  //   prevrushtam lista v object zashtoto inache ne stava s drugo

        for (int i = 0; i < numbers.length; i++) {                  // tuk sravnqvam dvete chisla s originalniq masiv i ako ima suvpadenie
            for (int j = 0; j < numbersFinal.length; j++) {         // dobavqm v lista indexite na chislata
                if(numbersFinal[j].equals(numbers[i])){
                    finalResult.add(i);
                }
            }
        }
        System.out.println(finalResult);

    }
    public static void solve(int[] numbers, int target, int index, int setIndex){
        if(sum==target){
            list.add(numberOne);
            list.add(numberTwo);
        }
        if(setIndex==numbers.length-1){
            return;
        }
        else{
            for (int i = index; i < numbers.length-1; i++) {
                sum=0;
                numberOne = numbers[index];
                numberTwo = numbers[setIndex+1];
                sum+=numberOne+numberTwo;
                solve(numbers, target, index, setIndex+1);
                index++;
                setIndex = i+1;
            }
        }
    }
}
