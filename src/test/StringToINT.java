package test;

import java.util.Scanner;

public class StringToINT {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();
        String numbers = scanner.nextLine();
        int x = scanner.nextInt();
        getNum(num,numbers,x);

    }
    public static void getNum(int a, String b, int c){
        int sum = 0;

        String[] parts = b.split(" ");
        int[] n1 = new int[parts.length];
        for(int n = 0; n < parts.length; n++) {
            n1[n] = Integer.parseInt(parts[n]);
        }
        for (int index = 0; index < n1.length; index++) {
            if(n1[index]==c){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
//    String firstLine = new Scanner(numbers).nextLine();      // taka chetem purviq red ot string
//        numbers = numbers.substring(0, firstLine.length());
//                System.out.println(numbers);
