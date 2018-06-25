package test;

public class PrimeNumberCalc {
    public static void main(String[] args) {
        int num = 12;
        int divider = 2;
        int maxDivider = (int) Math.sqrt(num);  // tova go pravim zashtoto inache proverkite na koi chisla se deli stavat mnogo
                                                // i go castvame kum INT zashtoto se poluchava drobno chislo
        boolean isPrime = true;
        while (divider <= maxDivider){
            if (num % divider == 0) {
                isPrime = false;
            }
            divider++;
        }
        System.out.println("Is it prime? ->" + isPrime);
    }
}
