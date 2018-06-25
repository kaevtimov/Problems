package test;


import java.util.Scanner;

public class OddEven {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum1 = 0;
        int sum2 = 0;

        for(int num = 0; num < n;num++){
            int number = scanner.nextInt();
            if(num % 2 ==0){
                sum1+=number;
            }else{
                sum2+=number;
            }
        }
        if (sum1==sum2){
            System.out.println("Yes");
            System.out.println("Sum = " + sum1);
        } else{
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(sum1 - sum2));
        }
    }
}
