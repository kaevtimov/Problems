package Recursion;

import java.util.ArrayList;

public class Recursion4 {       // list sum
    public static void main(String[] args){
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(5);
        nums.add(8);
        nums.add(2);
        nums.add(48);
        sumList(nums);
    }

    public static int sumList(ArrayList<Integer> numbers) {
        if (numbers.size() == 0 ) {
            return 0;
        }
        else {
            numbers = (ArrayList<Integer>) numbers.subList(1, numbers.size());
            return numbers.get(0) + sumList((ArrayList<Integer>) numbers.subList(1, numbers.size()));
        }
    }
}
