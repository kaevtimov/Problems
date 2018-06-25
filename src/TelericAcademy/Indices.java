package TelericAcademy;

import java.util.ArrayList;
import java.util.Scanner;

public class Indices {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        String numbers = scanner.nextLine();
        String[] parts = numbers.split(" ");
        int[] n1 = new int[parts.length];
        for(int n = 0; n < parts.length; n++) {
            n1[n] = Integer.parseInt(parts[n]);
        }

        boolean[] used = new boolean[N];
        for (int i = 0; i < N; i++) {
            used[i] = false;
        }

        ArrayList<Integer> result = new ArrayList<>();

        int cycle = -1;
        int currentIndex = 0;

        while(-1<currentIndex && currentIndex<N){
            if(used[currentIndex]){
                cycle=currentIndex;
                break;
            }
            used[currentIndex]=true;
            result.add(currentIndex);
            currentIndex=n1[currentIndex];
        }
        StringBuilder output = new StringBuilder();
        for(int x : result){
            if(cycle!=-1&&x==cycle){
                output.append("(");
            }
            output.append(x);
            output.append(" ");
        }
        if(cycle!=-1){
            output.append(")");
        }
        String outputString = output.toString();
        outputString = outputString.replace(" (", "(");
        outputString = outputString.replace(" )", ")");
        outputString = outputString.trim();

        System.out.println(outputString);
    }
}
