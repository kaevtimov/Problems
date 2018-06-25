package TelericAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MaxProductSub {
    public static int current;
    public static int best;
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = Arrays.stream(in.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int i = 0; i < numbers.length; i++) {
            current=numbers[i];
            for (int j = i+1; j < numbers.length; j++) {
                current*=numbers[j];
                if(current>best){
                    best=current;
                }
            }
        }
        System.out.println(best);
    }
}
