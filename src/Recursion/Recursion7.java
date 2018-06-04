package Recursion;

import java.util.Scanner;   // tuk tursim v masiv dali ima grupa ot chisla koqto suma e ravna na dadeno chislo
                            // tipichen BACKTRACKING
public class Recursion7 {
    private static int sum = 0;
    private static boolean isTrue = false;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {2, 1, 2, 4, 3, 5, 2, 6};
        System.out.println(groupSum(0, numbers, 14));
    }

    private static boolean groupSum(int index, int[] nums, int result) {
        if(sum==result){
            isTrue=true;
            return isTrue;
        }
//        if(index==nums.length){
//            return isTrue;
//        }
        else{
            for (int i = index; i < nums.length; i++) {
                sum+=nums[i];                                     // ETO TOVA
                groupSum(index+1, nums, 14);
                sum -= nums[i];                                                   // E "BACKTRACKING"
            }
        }return isTrue;
    }
}

