package TelericAcademy;

import java.util.Scanner;

public class ThreeGroups {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String array = scanner.nextLine();
        String[] numbers = array.split(" ");
        int[][] remainders = new int[3][];
        int remainder0 = 0;
        int remainder1 = 0;
        int remainder2 = 0;
        for (int i = 0; i < numbers.length; i++) {
            int num = Integer.parseInt(numbers[i]);
            if(num%3==0){
                remainder0++;
                remainders[0] = new int[remainder0];
            }else if(num%3==1){
                remainder1++;
                remainders[1] = new int[remainder1];
            }else if(num%3==2){
                remainder2++;
                remainders[2] = new int[remainder2];
            }
        }

        int counter0 = 0;
        int counter1 = 0;
        int counter2 = 0;
        for (int i = 0; i < numbers.length; i++) {
            int num = Integer.parseInt(numbers[i]);
            if(num%3==0){
                remainders[0][counter0] = num;
                counter0++;
            }else if(num%3==1){
                remainders[1][counter1] = num;
                counter1++;
            }else if(num%3==2){
                remainders[2][counter2] = num;
                counter2++;
            }
        }



        for (int i=0; i < remainders.length; i++) {
            if(remainders[i]==null){
                System.out.print("");
            }else{
                for (int j=0; j < remainders[i].length; j++)
                    System.out.print(remainders[i][j] + " ");
            }
            System.out.println();
        }
    }
}
