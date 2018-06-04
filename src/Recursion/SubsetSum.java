package Recursion;

import java.util.Scanner;

class SubsetSum {
    static boolean isSubsetSum(int set[], int n, int sum) {
        boolean subset[][] = new boolean[sum+1][n+1];

        for (int i = 0; i <= n; i++)
            subset[0][i] = true;

        for (int i = 1; i <= sum; i++)
            subset[i][0] = false;

        for (int i = 1; i <= sum; i++) {
            for (int j = 1; j <= n; j++) {
                subset[i][j] = subset[i][j - 1];
                if (i >= set[j - 1])
                    subset[i][j] = subset[i][j] ||
                            subset[i - set[j - 1]][j - 1];
            }
        }
        return subset[sum][n];
    }

    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();
        String numbers = scanner.nextLine();
        String[] parts = numbers.split(" ");
        int[] n1 = new int[parts.length];
        for(int n = 0; n < parts.length; n++) {
            n1[n] = Integer.parseInt(parts[n]);
        }
        int n = n1.length;

        if (isSubsetSum(n1, n, num) == true)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
