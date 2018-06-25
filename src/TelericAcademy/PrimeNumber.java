package TelericAcademy;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(primesToN(n));



    }
    public static boolean isPrime(int number){
        int divider = 2;
        int maxDivider = (int) Math.sqrt(number);
        boolean isPrime = true;
        while (divider <= maxDivider){
            if (number % divider == 0) {
                isPrime = false;
            }
            divider++;
        }
        return isPrime;
    }
    public static ArrayList primesToN(int number){
        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if(isPrime(i)==true){
                primes.add(i);
            }
        }
        return primes;
    }
}
