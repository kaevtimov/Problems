package test;

import com.sun.deploy.util.ArrayUtil;

import java.util.*;          // da remove chislata ot LIST koito sa po malki ot srednata im stoinost
import java.util.Arrays;

public class LISTIterator2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> numbers = new ArrayList<>();
        double sum = 0;
        //StringBuilder equals = new StringBuilder();

        for (int index = 0; index < n; index++) {
            numbers.add(scanner.nextInt());
        }

        for (Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext();) {
            Integer number = iterator.next();
            sum+=number;
        }
        double midSum = sum/numbers.size();

        for (Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext();) {
            Integer number = iterator.next();
            if(number<midSum){
                iterator.remove(); //!!!!!!!!!!!!!!!!
            }
        }
        System.out.println(numbers);
    }
}

