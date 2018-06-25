package test;

import java.util.Scanner;

public class Zadachki {
    public static void main(String[] args) {  // da nameri chislata ot 2-100 koito sa prime numbers
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a number: ");
        int num = scanner.nextInt();
        int n = 2;    // opredelqme chislata mejdu koito shte tursim
        int m = 100;  //
        for(int number = n; number <= m; number++) {    // tova e for loopa s koito opredelqme chisloto
            int maxDivider = (int) Math.sqrt(number); // trqbva da opredelim max divider koito da e raven na koren kvadraten ot chisloto
            boolean isPrime = true;
            for (int divider = 2; divider <= maxDivider; divider++) {
                if (number % divider == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && number <= num) {
                System.out.print(number + ", ");
            }
        }
    }
}