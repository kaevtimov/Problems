package Recursion;

import java.util.Arrays;
import java.util.Scanner;


public class Recurssion1 {
    private static int counter = 0;
    private static int[] vector;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        vector = new int[number];      // tuk pishem po kolko chisla da ima v grupa
        Gen01(0, 4, 8);
        System.out.println(counter);         // tova mi e broqcha na kombinaciite
    }
    public static void Gen01(int index, int start, int end){
        if(index==vector.length){
            System.out.println(Arrays.toString(vector));
            counter++;
        }
        else{
            for (int i = start; i <= end; i++) {          // tova e kombinaciq na chislata ot 1-5 kombinirani v grupa po "n"
                vector[index] = i;
                Gen01(index+1, i+1, end); // taka napisano ni izkarva kobinaciq ot chisla bez da se povtarqt v grupata
            }                                         // inache ako iskame da se povtarqt pishem samo "i"
        }
    }
}
