package TelericAcademy;

import java.util.*;

public class ThreeSumtest {
    public static ArrayList<Integer> list;
    public static ArrayList<Integer> finalResult = new ArrayList<>();
    public static HashSet<ArrayList> list2 = new HashSet<>();
    public static int numberOne = 0;
    public static int numberTwo = 0;
    public static int sum;
    public static int number;
    public static int targetSum;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int targetSum = scanner.nextInt();
        scanner.nextLine();
        sum = targetSum;
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < numbers.length-2; i++) {
            number = numbers[i];
            for (int j = i+1; j < numbers.length; j++) {
                solve(numbers, targetSum, j, 0, targetSum);
            }
        }
        //System.out.println(list2);

    }
    public static void solve(int[] numbers, int target, int index, int setIndex, int targetSum){
        if(sum==0){
            list = new ArrayList<>();
            list.add(number);
            list.add(numberOne);
            list.add(numberTwo);
            //list.sort(Comparator.naturalOrder());
            list2.add(list);
            System.out.println(list2);
        }
        if(setIndex==numbers.length-2){
            return;
        }
        else{
            for (int i = index; i < numbers.length-1; i++) {
                sum = targetSum;
                sum -= number;
                numberOne = numbers[index];
                numberTwo = numbers[setIndex+2];
                sum-=numberOne;
                sum-=numberTwo;
                solve(numbers, target, index, setIndex+1, targetSum);
                index++;
                setIndex = i;
            }
        }
    }
}

