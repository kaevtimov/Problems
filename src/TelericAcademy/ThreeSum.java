package TelericAcademy;

import java.util.*;

public class ThreeSum {
    public static int sum;
    public static int counter = 1;
    public static int numberThree = 0;
    public static int numberTwo = 0;
    public static int number;
    public static ArrayList<Integer> list;
    public static HashSet<ArrayList> list2 = new HashSet<>();
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        sum = numbers[0];

        solve(numbers, 0, 6);
        System.out.println(list2);

    }
    public static void solve(int[]numbers, int index, int target){
        if(index==numbers.length){
            counter = 1;
            return;
        }
        if(sum==target){
            list = new ArrayList<>();
            list.add(number);
            list.add(numberTwo);
            list.add(numberThree);
            list.sort(Comparator.naturalOrder());
            list2.add(list);
        }
        else{
            for (int i = index; i < numbers.length-2; i++) {
                number = numbers[i];
                sum = number;
                for (int j = i+1; j < numbers.length-1; j++) {
                    numberTwo = numbers[j];
                    numberThree = numbers[j+counter];
                    sum+= numberTwo + numberThree;
                    counter++;
                    solve(numbers, index, target);
                    index++;
                }
            }
        }
    }
}
