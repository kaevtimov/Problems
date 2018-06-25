package test;

import java.util.*;


public class MinMaxSumAvrg{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        double num;
        double maxNum = -10000;
        double minNum = 10000;
        double sum=0;
        double avrg;


        for (int i = 0; i < n ; i++) {
            num = scanner.nextDouble();
            sum+=num;
            if(num>maxNum){
                maxNum=num;
            }
            if(num<minNum){
                minNum=num;
            }
        }
        avrg=sum/n;
        if(minNum==0){
            System.out.println("min=0");
        }else{
            System.out.printf("min=%.2f\n", minNum);
        }
        if(maxNum==0){
            System.out.println("max=0");
        }else{
            System.out.printf("max=%.2f\n", maxNum);
        }
        if(sum==0){
            System.out.println("sum=0");
        }else{
            System.out.printf("sum=%.2f\n", sum);
        }
        if(avrg==0){
            System.out.println("avg=0");
        }else{
            System.out.printf("avg=%.2f", avrg);
        }
    }
}
