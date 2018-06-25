package test;

// tozi map shte ni pokaje chisloto koeto se povtarq nai- mnogo puti i kolko puti se povtarq

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostFreqElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] nums = new int[n];
        int mostFreqNum = 0;
        int mostFreqOccur = 0;
        Map<Integer, Integer> numbers = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            nums[i] = scan.nextInt();
        }

        for (Integer i : nums) {
            if (numbers.containsKey(i))
                numbers.put(i, numbers.get(i) + 1);
            else {
                numbers.put(i, 1);
            }
            if (numbers.get(i) > mostFreqOccur) {
                mostFreqNum = i;
                mostFreqOccur = numbers.get(i);
            }
        }
        System.out.println("The number is: " + mostFreqNum + " and occurs " + mostFreqOccur + " times.");
    }
}


