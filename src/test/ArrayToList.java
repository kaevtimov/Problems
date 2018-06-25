package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayToList {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Integer[] numbers = {1,13,3,4,11,5,7,8};
        List myList = Arrays.asList(numbers);
        System.out.println(myList);
    }
}
