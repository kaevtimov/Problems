package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HexadecimalToBinary {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String hexadeimal = scanner.nextLine();
        List myList = new ArrayList();

        for (int i = 0; i < hexadeimal.length(); i++) {
            char ch = hexadeimal.charAt(i);
            if(ch=='A' || ch=='a'){
                myList.add("1010");
            }else if(ch=='B' || ch=='b'){
                myList.add("1011");
            }else if(ch=='C' || ch=='c'){
                myList.add("1100");
            }else if(ch=='D' || ch=='d'){
                myList.add("1101");
            }else if(ch=='E' || ch=='e'){
                myList.add("1110");
            }else if(ch=='F' || ch=='f'){
                myList.add("1111");
            }else if(ch==48){
                myList.add("0000");
            }else if(ch==49){
                myList.add("0001");
            }else if(ch==50){
                myList.add("0010");
            }else if(ch==51){
                myList.add("0011");
            }else if(ch==52){
                myList.add("0100");
            }else if(ch==53){
                myList.add("0101");
            }else if(ch==54){
                myList.add("0110");
            }else if(ch==55){
                myList.add("0111");
            }else if(ch==56){
                myList.add("1000");
            }else if(ch==57){
                myList.add("1001");
            }
        }
        String test = myList.toString();
        String decimal = test.replace(", ", "").replace("[", "").replace("]", "");
        String neew = decimal.replaceFirst("^0+(?!$)", "");
        System.out.println(neew);
    }
}
