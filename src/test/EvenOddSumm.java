package test;


import java.text.DecimalFormat;
import java.util.Scanner;

public class EvenOddSumm {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double sumEven = 0;
        double evenMin = Double.MAX_VALUE;
        double evenMax = (double) Integer.MIN_VALUE;;
        double sumOdd = 0;
        double oddMin = Integer.MAX_VALUE;
        double oddMax = (double) Integer.MIN_VALUE;
        DecimalFormat df = new DecimalFormat("#.######");


        for (int i = 1; i <= n; i++) {
            double num = scanner.nextDouble();
            if(i % 2 ==0){
                sumEven+=num;
                if(num<evenMin){
                    evenMin=num;
                }
                if(num>evenMax){
                    evenMax=num;
                }
                else if(n == 1){
                    sumEven = 0;
                }
            } else{
                sumOdd+=num;
                if(num<oddMin){
                    oddMin=num;
                }
                if(num>oddMax){
                    oddMax=num;
                }
            }
        }
        if(n ==0){
            System.out.println("OddSum=0," +
                    "OddMin=No," +
                    "OddMax=No," +
                    "EvenSum=0," +
                    "EvenMin=No," +
                    "EvenMax=No");
        }else if(n==1){
            System.out.println("Oddsum=" + df.format(sumOdd) + ",");
            System.out.println("Oddmin=" + df.format(oddMin) + ",");
            System.out.println("Oddmax=" + df.format(oddMax) + ",");
            System.out.println(
                    "EvenSum=0,\n" +
                            "EvenMin=No,\n" +
                            "EvenMax=No\n");
        } else {
            System.out.println("Oddsum=" + df.format(sumOdd) + ",");
            System.out.println("Oddmin=" + df.format(oddMin) + ",");
            System.out.println("Oddmax=" + df.format(oddMax) + ",");
            System.out.println("Evensum=" + df.format(sumEven) + ",");
            System.out.println("Evenmin=" + df.format(evenMin) + ",");
            System.out.println("Evenmax=" + df.format(evenMax) + ",");

        }
    }
}
