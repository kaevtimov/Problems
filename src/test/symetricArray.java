package test;

import java.util.Scanner;

public class symetricArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        String string = "";
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            String numbers = scanner.nextLine();
            String[] parts = numbers.split(" ");
            int[] n1 = new int[parts.length];
            for(int p = 0; p < parts.length; p++) {
                n1[p] = Integer.parseInt(parts[p]);
            }
            boolean symmetric = true;
            for (int index = 0; index < (n1.length + 1) / 2; index++) {
                if (n1[index] != n1[n1.length - index - 1])
                    symmetric = false;
            }
            if(symmetric){
                string+= "Yes\n";
            }else{
                string+="No\n";
            }
        }
        System.out.println(string.trim());
    }
}
