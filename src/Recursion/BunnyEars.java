package Recursion;

import java.util.Scanner;

public class BunnyEars {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(bunnyEars(n));
    }

    private static int bunnyEars(int num) {
        if(num==0){
            return 0;
        }
        if(num==1){
            return 2;
        }
        else{
            if(num%2==0){
                return 3 + bunnyEars(num-1);
            }else{
                return 2 + bunnyEars(num-1);
            }
        }
    }
}
