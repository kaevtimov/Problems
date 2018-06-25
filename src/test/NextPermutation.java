package test;

import java.util.*;

public class NextPermutation {
    private static int n;
    public static int counter=0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        input.nextLine();
        String firstPermutation = input.nextLine();
        int[] result = new int[n];

        permute(result, 0, firstPermutation);
    }
    private static void printResult(int[] result, String firstPermutation) {
        Set<Integer> set = new HashSet<>();
        for (Integer num : result) {
            set.add(num);
        }

        if(set.size() == n) {
            StringBuilder string = new StringBuilder();
            for (int i = 0; i < result.length; i++) {
                string.append(result[i] + " ");
            }
            string.deleteCharAt(string.length()-1);
            if(counter==1){
                for (Integer num : result) {
                    System.out.print(num + " ");
                }
                System.out.println();
                counter++;
            }
            if(string.toString().equals(firstPermutation)){
                counter++;
            }
        }
    }

    private static void permute(int[] result, int index, String firstPermutation) {
        if (index == result.length) {
            printResult(result, firstPermutation);
            return;
        }
        for (int i = 1; i <= n; i++) {
            result[index] = i;
            permute(result, index+1, firstPermutation);
        }
    }
}
