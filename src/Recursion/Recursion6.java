package Recursion;

import java.util.Arrays;
import java.util.Scanner;          // tova e kato Recursion1, no sus Set ot chisla


public class Recursion6 {
    public static int counter = 0;
    public static int[] vector;
    public static int[] set;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        vector = new int[number];
        set = new int[]{1, 2, 58, 78, 6, 9};
        Gen01(0, 0);
        System.out.println(counter);
    }
    public static void Gen01(int index, int setIndex){
        if(index==vector.length){
            System.out.println(Arrays.toString(vector));
            counter++;
        }
        else{
            for (int i = setIndex; i < set.length; i++) {         // bez da se povtarqt chisla v grupata
                vector[index] = set[i];
                Gen01(index+1, i+1);
            }
        }
    }
}