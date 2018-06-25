package test;
import java.util.Scanner;

public class BiggestPrimeNum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while(prim(n) == false){
            n--;
        }
        System.out.println(n);

    }


    public static boolean prim(int m){
        int n=m;
        for(int i=2;i<n;i++){
            if(n%i == 0){
                return false;
            }

        }
        return true;
    }
}
