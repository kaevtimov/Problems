package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Recurssion2 {
    public static int counter = 0;  // counter ni broi kombinaciite
    private static ArrayList<String> getAllNBitNumbers(int n){
        ArrayList<String> combinations = new ArrayList<>();
        generateNBitCombinations("", n, combinations);
        return combinations;
    }

    private static void generateNBitCombinations(String combination, int n, List<String> combinations) {
        if(combination.length()==n){
            combinations.add(combination);
            counter++;
            return;
        }
        generateNBitCombinations(combination + "0", n, combinations);
        generateNBitCombinations(combination + "1", n, combinations);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        getAllNBitNumbers(5)
                .forEach(System.out::println);
        System.out.println(counter);
    }
}
