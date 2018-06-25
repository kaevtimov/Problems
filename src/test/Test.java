package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Test {
    public static int[] array;
    public static ArrayList<Integer> list = new ArrayList<>();
    //public static HashSet<Integer> list = new HashSet<>();
    public static int counter = 0;
    public static int number;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        array = new int[number];
        permutation(0, 1,number);          // permutaciq na chislata ot 1-number
    }
    public static ArrayList<Integer> permutation(int index, int start, int end){
        if(list.size()==number){
            System.out.println(list);
            return list;
        }else{
            for (int i = start; i <= end; i++) {
                list.add(array[i]);
                permutation(index+1, start+1, end);   // ako ne iskame povtoreniq i+1
            }
        }
        return list;
    }
}
