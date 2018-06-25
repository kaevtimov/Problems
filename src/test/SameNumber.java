package test;

// namerete kolko puti se povtarq edno i sushto chislo v masiv

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class SameNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] nums = new int[n];
        int element = 0;
        int count = 0;

        for(int i = 0; i < nums.length;i++){
            nums[i]= scan.nextInt();
        }

        for(int i = 0; i < nums.length;i++){
            int number = nums[i];
            int tempCount = 0;
            for (int j = 0; j < nums.length; j++){
                if(nums[j] == number) {
                    tempCount++;
                }
            }
            if (tempCount > count){
                    count = tempCount;
                    element = number;
            }
        }
        System.out.println("The most frequent element is:" + element + ",  freq: " + count);
    }
}



