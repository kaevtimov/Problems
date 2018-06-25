package TelericAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class TEST3 {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();

        int N = Integer.parseInt(in.readLine());
        int[] numbers = Arrays.stream(in.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>max){
                max = numbers[i];
            }
        }
        int biggestDiv = 0;

        for (int i = 1; i <= max; i++) {
            boolean fit = true;
            for (int j = 0; j < numbers.length; j++) {
                if(numbers[j]%i!=0){
                    fit = false;
                }
            }
            if(fit==true && i > biggestDiv){
                biggestDiv=i;
            }
        }
        //list.add(biggestDiv);

        for (int i = 0; i < numbers.length; i++) {
            String number = Integer.toString(numbers[i]);
            for (int j = 0; j < number.length(); j++) {
                char character = number.charAt(j);
                int digit = character-'0';
                if(digit%2==0){
                    if(digit==0){
                        int newDigit = 9;
                        number = number.replace(character, (char)(newDigit + '0'));
                    }else{
                        int newDigit = digit-1;
                        number = number.replace(character, (char)(newDigit + '0'));
                    }
                }else{
                    if(digit==9){
                        int newDigit = 0;
                        number = number.replace(character, (char)(newDigit + '0'));
                    }else{
                        int newDigit = digit+1;
                        number = number.replace(character, (char)(newDigit + '0'));
                    }
                }
            }
            list.add(Integer.parseInt(number));
        }
        System.out.println(list);
    }
}
