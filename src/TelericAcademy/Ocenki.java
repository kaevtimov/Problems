package TelericAcademy;

import java.util.ArrayList;
import java.util.Scanner;

public class Ocenki {
    public static ArrayList<Double> list;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int results = scanner.nextInt();
        scanner.nextLine();
        String[] numbers = scanner.nextLine().split(" ");
        ArrayList<Double> list = new ArrayList<>();
        double maxGrade = Double.MIN_VALUE;
        double minGrade = Double.MAX_VALUE;
        double sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            list.add(Double.parseDouble(numbers[i]));
            if(list.get(i)>maxGrade){
                maxGrade=list.get(i);
            }
            if(list.get(i)<minGrade){
                minGrade=list.get(i);
            }
        }


        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)==minGrade){
                list.remove(i);
                break;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)==maxGrade){
                list.remove(i);
                break;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            sum+=list.get(i);
        }
        int finalResult = (int)Math.round((sum/list.size()));
        System.out.println(finalResult);
    }
}