package TelericAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class SearchInARangeBinary {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = Arrays.stream(in.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int N = Integer.parseInt(in.readLine());
        int counter = 1;
        int counter2 = 0;
        int left = numbers[counter2];
        int right = numbers[numbers.length-counter];
        ArrayList<Integer> list = new ArrayList<>();

        while(left<=right){
            if(left==N && right==N){
                list.add(counter2);
                list.add(numbers.length-counter);
                break;
            }
            if(left==N && right!=N){
                counter++;
            }else if(left!=N && right==N){
                counter2++;
            }else{
                counter++;
                counter2++;
            }
            left = numbers[counter2];
            right = numbers[numbers.length-counter];
        }
        if(list.size()==0){
            list.add(-1);
            list.add(-1);
        }
        System.out.println(list);
    }
}