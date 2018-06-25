package test;

import java.util.Scanner;
// da namerim nai dulgata redica ot posledovatelni chisla- 8 73234224= 3
public class ZadachkiArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); // tuk dobavqme razmera na masiva koito e ravne na 8
        int current = 1; // vinagi e ravno na 1 zashtoto vinagi imame 1 element
        int max = 1; // po sushtata prichina
        int prev = scan.nextInt();

        for(int i = 1; i < n; i++){
            int next = scan.nextInt();

            if (prev < next) {
                current++;
            }
            else {
                current = 1;
            }
            max = Math.max(current, max);
            prev = next;  // za da produlji sus sledvashtoto
        }
        System.out.println(max);
    }
}
