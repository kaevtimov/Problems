package TelericAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tubes {

    public static int min;
    public static int max;
    public static int result;
    public static int M;
    public static int N;
    public static int[] numbers;
    public static int current = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(in.readLine());
        M = Integer.parseInt(in.readLine());
        numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(in.readLine());
            if(numbers[i]>max){
                max=numbers[i];
            }
        }
        solveTubes(1, max);
    }
    public static void solveTubes(int start, int maximum){
        if(current==M && start==maximum){
            result = maximum;
            System.out.println(result);
        }
        else{
            current=0;
            for (int i = 0; i < N; i++) {
                current+=numbers[i]/maximum;
            }
            if(current < M){        // max e tvurde golqm
                min = start;
                max = maximum;
                solveTubes(min,(min+max)/2);
            }else{                       // max e tvurde maluk
                min=maximum;
                max=max;
                solveTubes(min,(min+max)/2);
            }
        }
    }
}
