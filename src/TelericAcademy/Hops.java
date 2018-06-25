package TelericAcademy;

import java.util.Scanner;

public class Hops {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split(", ");
        int[] path = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            path[i] = Integer.parseInt(parts[i]);
        }

        int bestResult = Integer.MIN_VALUE;
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            boolean[] checked = new boolean[parts.length];
            String pathTest = scanner.nextLine();
            String[] hops = pathTest.split(", ");
            int number = 0;
            int currentIndex = 0;
            int result = path[0];
            while(currentIndex<path.length && currentIndex>=0 && checked[currentIndex]==false){
                checked[0] = true;
                for (int j = 0; j < hops.length; j++) {   //while currentIndex<path.length
                    number = Integer.parseInt(hops[j]);
                    currentIndex+=number;     // opredelq mi indexa na chisloto s koeto subiram sumata
                    if(currentIndex<0 || currentIndex>path.length-1){
                        break;
                    }
                    if(checked[currentIndex]==true){
                        break;/////
                    }
                    if(currentIndex!=0 && checked[currentIndex]==false){ ////0
                        result+=path[currentIndex];
                        checked[currentIndex]=true;
                    }
                }
                if(result>bestResult){
                    bestResult=result;
                }
            }
        }
        System.out.println(bestResult);
    }
}
