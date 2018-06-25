package test;

import java.util.Scanner;

public class JoroTheRabbit {
    private static int maxSteps = 0;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        String[] parts = numbers.split(", ");
        int[] n1 = new int[parts.length];
        for(int n = 0; n < parts.length; n++) {
            n1[n] = Integer.parseInt(parts[n]);
        }
        for (int i = 0; i < n1.length; i++) {
            for (int j = 1; j < n1.length; j++) {
                int currentStep = 1;
                int currentIndex = i;
                int nextIndex = currentIndex+j;
                nextIndex = (currentIndex+j)%n1.length;                  // i tuk ako nextIndex izliza ot masiva
                while(n1[currentIndex]<n1[nextIndex]){
                    currentStep++;
                    currentIndex=nextIndex;
                    nextIndex = (currentIndex+j) % n1.length;            // tuk e cakata na prevurtaneto
                }
                if(currentStep>maxSteps){
                    maxSteps = currentStep;
                }
            }
        }
        System.out.println(maxSteps);
    }
}
