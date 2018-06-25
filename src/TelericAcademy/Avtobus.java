package TelericAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Avtobus {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int counter = 0;

        int targetSum = Integer.parseInt(in.readLine());
        int[] numbers = Arrays.stream(in.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < numbers.length; i++) {
            sum = numbers[i];
            if(sum==targetSum){
                counter++;
            }
            for (int j = i+1; j < numbers.length; j++) {
                sum+=numbers[j];
                if(sum==targetSum){
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
