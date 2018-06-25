package test;

import java.util.Scanner;

public class Elephants {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split(" ");
        int k = Integer.parseInt(parts[0]);
        String n = parts[1];
        int sum = 0;
        if(k<=n.length()){
            for (int i = 0; i < k; i++) {
                if(n.charAt(i)=='0'){
                    sum++;
                }
            }
        }else if(k>n.length()){
            sum+=k-n.length();
            for (int i = 0; i < n.length(); i++) {
                if(n.charAt(i)=='0'){
                    sum++;
                }
            }
        }
        System.out.println(sum);         //10 312001020102020 testcase 5
                                         // 11 2300223232320000 testcase 8
    }
}

