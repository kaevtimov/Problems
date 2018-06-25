package TelericAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TribonacciTriangle {
    public static ArrayList<Long> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        long number1 = Long.parseLong(in.readLine());
        long number2 = Long.parseLong(in.readLine());
        long number3 = Long.parseLong(in.readLine());
        long L = Long.parseLong(in.readLine());            // kolko linii da ima triugulnika
        StringBuilder str = new StringBuilder();

        list.add(number1);
        list.add(number2);
        list.add(number3);

        int counter = 1;
        long newL = L;
        for (int i = 0; i < L-3; i++) {
            newL += L-counter;
            counter++;

        }
        for (int i = 0; i < newL; i++) {
            long brick = number1 + number2 + number3;
            number1 = number2;
            number2 = number3;
            number3 = brick;
            list.add(brick);
        }

        int counter1 = 1;
        int counter2 = 2;


        if(L>2){
            for (int i = 0; i < newL+3; i++) {
                if(i==counter1){
                    str.append("\n");
                    counter1+=counter2;
                    counter2++;
                }
                str.append(list.get(i) + " ");
            }
        }else{
            str.append(list.get(0) + "\n");
            str.append(list.get(1) + " " + list.get(2));
        }
        System.out.println(str);
    }
}
