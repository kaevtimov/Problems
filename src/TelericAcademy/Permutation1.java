package TelericAcademy;

import java.util.Arrays;
import java.util.Scanner;

public class Permutation1 {
    public static int[] array;
    public static int counter = 0;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt(); //
        array = new int[number];
        permutation(0, 1,number);          // permutaciq na chislata ot 1-number
    }
    public static void permutation(int index, int start, int end){
        if(index==array.length){
            System.out.println(Arrays.toString(array));
            //counter++;
        }else{
            for (int i = start; i <= end; i++) {
                array[index]= i;
                permutation(index+1, start, end);   // ako ne iskame povtoreniq i+1
            }
        }
    }
}
