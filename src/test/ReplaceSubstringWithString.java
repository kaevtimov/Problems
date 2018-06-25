package test;

import java.util.*;
import java.util.Arrays;

public class ReplaceSubstringWithString {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String string = "The quick brown fox jumps over the lazy dog.";
        String[] parts = string.split(" ");

        String result = string.replaceAll("fox", "cat");
        System.out.println(result);

    }
}
