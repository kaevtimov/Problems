package TelericAcademy;

import java.util.Arrays;
import java.util.Scanner;

public class ZadachaIzpitMatrix {
    public static int result = 0;
    public static int best = Integer.MIN_VALUE;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); //number of rows
        scanner.nextLine();
        String[] parts = scanner.nextLine().split(" ");   // purvi red
        int M = parts.length;      // number or cols
        int[][] matrix = new int[N+1][M+1];
        for (int col = 1; col < matrix[0].length; col++) {
            matrix[1][col] = Integer.parseInt(parts[col-1]);
        }

        for (int row = 2; row < matrix.length; row++) {
            String numbers = scanner.nextLine();
            for (int col = 1; col <= matrix[0].length-1; col++) {
                String[] nums = numbers.split(" ");
                int num = Integer.parseInt(nums[col-1]);
                matrix[row][col]=num;
            }
        }
        int [] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < numbers.length-1; i+=2) {
            result = 0;
            int R = numbers[i];
            int C = numbers[i+1];
            if(R > 0){
                for (int row = R; row < R+1; row++) {
                    for (int col = 1; col <= Math.abs(C); col++) {
                        result+=matrix[row][col];
                        int counterUP = R;
                        int counterDOWN = R;
                        if(col==C && C > 0){                                    // tuk opredelqme dali da trugnem nagore
                            while(counterUP>0){
                                result+=matrix[counterUP-1][col];
                                counterUP--;
                            }
                        }else if(col==Math.abs(C) && C < 0){                       // tuk dali da trugnem nadolu
                            while(counterDOWN<matrix.length-1){
                                result+=matrix[counterDOWN+1][col];
                                counterDOWN++;
                            }
                        }
                    }
                }
                if(result>best){
                    best=result;
                }
            }
            else if(R < 0){
                for (int row = Math.abs(R); row < Math.abs(R)+1; row++) {
                    for (int col = matrix[0].length-1; col >= Math.abs(C); col--) {
                        result+=matrix[row][col];
                        int counterUP = Math.abs(R);
                        int counterDOWN = Math.abs(R);
                        if(col==C && C > 0){                                  // tuk opredelqme dali da trugnem nagore
                            while(counterUP>0){
                                result+=matrix[counterUP-1][col];
                                counterUP--;
                            }
                        }else if(col==Math.abs(C) && C < 0){                       // tuk dali da trugnem nadolu
                            while(counterDOWN<matrix.length-1){
                                result+=matrix[counterDOWN+1][col];
                                counterDOWN++;
                            }
                        }
                    }
                }
                if(result>best){
                    best=result;
                }
            }
        }
        System.out.println(best);
    }
}
