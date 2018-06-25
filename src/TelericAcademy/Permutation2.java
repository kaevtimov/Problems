package TelericAcademy;

import java.util.Arrays;
import java.util.Scanner;

public class Permutation2 {
    public static int[] array = {1,2,3};
    public static int[] array1 = new int[3];           // s razlichna duljina
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        permutation(0,0);
    }
    public static void permutation(int index, int setIndex){
        if(index==array1.length){
            System.out.println(Arrays.toString(array1));
        }else{
            for (int i = setIndex; i < array.length; i++) {
                array1[index] = array[i];
                permutation(index+1,setIndex+1);
            }
        }
    }
}
