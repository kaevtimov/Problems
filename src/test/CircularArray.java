package test;

import java.util.Scanner;
import java.util.Arrays;

public class CircularArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] path1 = new int[n];
        int[] path = new int[n*2];

        for (int i = 0; i < n; i++) {
            path1[i] = scanner.nextInt();
        }

        for (int index = 0; index < n; index++) {
            path[index] = path[n+index]= path1[index];
        }
        System.out.println(Arrays.toString(path));
    }
}
