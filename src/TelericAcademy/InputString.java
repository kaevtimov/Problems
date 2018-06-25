package TelericAcademy;

import java.util.Scanner;

public class InputString {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        scanner.nextLine();
        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];
        for(int n = 0; n < input.length; n++) {
            numbers[n] = Integer.parseInt(input[n]);
        }

    }
}
