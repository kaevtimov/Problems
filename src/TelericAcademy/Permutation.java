package TelericAcademy;

import java.util.Arrays;
import java.util.Scanner;

public class Permutation {
    //public static int[] array = {7,5};
    public static int[] numbers;
    public static int[] array1;
    public static int[] array = new int[2];
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int number1 = numbers[0];
        int number2 = numbers[1];
        int maxNumber = Math.max(number1, number2);
        int minNumber = Math.min(number1, number2);
        array[0] = minNumber;
        array[1] = maxNumber;
        array1 = new int[N];
        permutation(0, 0);

    }
    public static void permutation(int index, int setIndex){
        if(index==array1.length){
            System.out.println();
            for (int i = 0; i < array1.length; i++) {
                System.out.print(array1[i]);
            }
        }else{
            for (int i = setIndex; i < array.length; i++) {
                array1[index] = array[i];
                permutation(index+1,setIndex);
            }
        }
    }
}
