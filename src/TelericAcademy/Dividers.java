package TelericAcademy;

import java.util.Scanner;

public class Dividers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split(" ");
        long m = Long.parseLong(parts[0]);
        long n = Long.parseLong(parts[1]);
        long N = Math.max(m,n);
        long sqr = (long)Math.sqrt(N);
        StringBuilder str = new StringBuilder();
        for (long i = 2; i <=sqr; i++) {
            if(isPrime(i)==true && n%i==0 && m%i==0){
                str.append(i);
                str.append(' ');
            }
        }
        if(str.length()==0){
            System.out.println(-1);
        }else{
            System.out.println(str);
        }

    }
    public static boolean isPrime(long number){
        long divider = 2;
        long maxDivider = (long) Math.sqrt(number);
        boolean isPrime = true;
        while (divider <= maxDivider){
            if (number % divider == 0) {
                isPrime = false;
            }
            divider++;
        }
        return isPrime;
    }
}