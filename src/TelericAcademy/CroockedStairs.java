package TelericAcademy;

import java.util.ArrayList;
import java.util.Scanner;

public class CroockedStairs {
    public static ArrayList<Long> list = new ArrayList<>();
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long firstBrick = scanner.nextLong();
        long secondBrick = scanner.nextLong();
        long thirdBrick = scanner.nextLong();
        long L = scanner.nextLong();              // number of layers
        StringBuilder str = new StringBuilder();

        list.add(firstBrick);
        list.add(secondBrick);
        list.add(thirdBrick);

        int counter = 1;
        long newL = L;
        for (int i = 0; i < L-3; i++) {
            newL += L-counter;
            counter++;

        }
        for (int i = 0; i < newL; i++) {
            long brick = firstBrick+secondBrick+thirdBrick;
            firstBrick=secondBrick;
            secondBrick=thirdBrick;
            thirdBrick=brick;
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
