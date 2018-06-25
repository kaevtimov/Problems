package test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
// zadavame 8 chisla, sled tova trqbva da namerim trite nai golemi i da gi suberem

public class ZadachkiArray3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();  // tova sa ni 8te chisla
        int k = scan.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        for(int i = 0; i < list.size(); i++){
            list.add(scan.nextInt());
        }

        list.sort(Comparator.naturalOrder());  // tuk sortirame chislata v spisuka vuv vuzhodqsht red
        for(int i = list.size() - 1; i > list.size() - k - 1; i--){  // tova e obraten for loop
            sum += list.get(i);
        }
        System.out.println(sum);
    }
}