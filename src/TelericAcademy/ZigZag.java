package TelericAcademy;

import java.util.Scanner;

public class ZigZag {
    public static long sum=0;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] string = scanner.nextLine().split(" ");
        short N = Short.parseShort(string[0]);
        short M = Short.parseShort(string[1]);

        for (int row = 0; row < N; row++) {
            if(row%2==0){
                for (int col = 0; col <= M-2; col+=2) {
                    if(row%2==0 && col%2==0){
                        if(row==0 || row==N-1){
                            sum+=(row+col)*3+1;
                        }else{
                            if(col==0){
                                sum+=(row+col)*3+1;
                            }else{
                                sum+=(row+col)*3+1 + (row+col)*3+1;
                            }
                        }
                    }
                }
            }else{
                for (int col = 1; col <= M-1; col+=2) {
                    if(row==N-1){
                        sum+=(row+col)*3+1;
                    }else{
                        if(col!=M-1){
                            sum+=(row+col)*3+1 + (row+col)*3+1;
                        }else{
                            sum+=(row+col)*3+1;
                        }
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
