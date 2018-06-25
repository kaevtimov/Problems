package test;

import java.util.*;

public class Permutations {
    private static int n;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int[] result = new int[n];

        permute(result, 0);
    }

    private static void permute(int[] result, int index) {
        if (index == result.length) {
            HashSet<Integer> set = new HashSet<>();
            for (Integer num : result) {
                set.add(num);
            }
            if (set.size() == n) {
                for (Integer num : result) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
            return;
        }
        for (int i = 1; i <= n; i++) {
            result[index] = i;
            permute(result, index + 1);
        }
    }
}
