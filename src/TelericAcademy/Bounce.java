package TelericAcademy;

import java.util.Scanner;

public class Bounce {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String nm = scanner.nextLine();
        String[] parts = nm.split(" ");
        int[] n1 = new int[parts.length];
        for(int n = 0; n < parts.length; n++) {
            n1[n] = Integer.parseInt(parts[n]);
        }
        int n = n1[0];
        int m = n1[1];

        long[] powsTwo = new long[n+m-1];
        powsTwo[0] = 1;
        for (int i = 1; i < n+m-1; i++) {
            powsTwo[i]=powsTwo[i-1]*2;
        }

        int currentR = 0;
        int currentC = 0;
        int horizontal = 1;
        int vertical = 1;
        long result = 1;

        while(true) {
            int nextR =  currentR+vertical;
            int nextC = currentC+horizontal;
            if(nextR<0 || n<=nextR){
                vertical*=-1;
            }
            if(nextC<0 || m<=nextC){
                horizontal*=-1;
            }
            currentR+=vertical;
            currentC+=horizontal;
            if(currentR<0 || currentR>=n || currentC<0 || currentC>=m){
                break;
            }
            result+=powsTwo[currentR+currentC];

            if((currentR==0 && currentC==0) ||
                    (currentR==0 && currentC==m-1) ||
                    (currentR==n-1 && currentC==0) ||
                    (currentR==n-1 && currentC==m-1)){
                break;
            }

        }
        System.out.println(result);
        }
    }
