package test;

import com.sun.deploy.util.ArrayUtil;

import java.util.*;
import java.util.Arrays;

public class LISTIterator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> numbers = new ArrayList<>();
        int sum = 0;
        int midSum = 0;
        //StringBuilder equals = new StringBuilder();

        for (int index = 0; index < n; index++) {
            numbers.add(scanner.nextInt());
        }

        for (Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext();) {
            Integer number = iterator.next();
            sum+=number;
        }
        System.out.println(sum);
    }
}
