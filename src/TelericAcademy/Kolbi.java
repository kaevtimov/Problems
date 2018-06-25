package TelericAcademy;

import java.util.Scanner;

public class Kolbi {
    private static long capacity;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] parts = string.split(" ");
        long numBottle = Long.parseLong(parts[0]);
        long quantity = Long.parseLong(parts[1]);
        long bestBottle = 0;

        for (int i = 1; i <= numBottle; i++) {
            if(i==1){
                capacity = 0;
            }else{
                capacity = (i-1)+capacity;
            }

            if(i%2!=0 && quantity<=capacity){
                bestBottle=i;
                break;
            }
        }
        System.out.println(bestBottle);
    }
}
