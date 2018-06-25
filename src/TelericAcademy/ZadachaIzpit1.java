package TelericAcademy;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class ZadachaIzpit1 {
    public static BigInteger result = BigInteger.valueOf(0);
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String str = "";  // tova mi e chilsoto
        for (int i = string.length()-1; i >= 0; i--) {
            str += "" + string.charAt(i);
        }

        int[] numbers = new int[str.length()];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        //System.out.println(Arrays.toString(numbers));
        ArrayList<Integer> list = new ArrayList<>();

        list.add(0);
        for (int i = 0; i < numbers.length; i++) {
            list.add(numbers[i]);
        }
        //System.out.println(list);

        for (int i = list.size()-1; i >= 0; i--) {
            if(i%2!=0){
                result.add(BigInteger.valueOf((list.get(i) * (long)Math.pow(i, 2))));                 // result+= (list.get(i) * Math.pow(i, 2));
            }else{
                result.add(BigInteger.valueOf((long)(Math.pow(list.get(i), 2) * i)));//result+= (Math.pow(list.get(i), 2) * i);
            }
        }
        //System.out.println(result);

//        BigInteger lastDigit = result.mod(BigInteger.valueOf((long)10));//long lastDigit = result%10; // tova e duljinata suobshtenieto
//        BigInteger S = result.mod(BigInteger.valueOf((long)26));//long S = result%26;
//        BigInteger start = S.add(BigInteger.valueOf(1));
//        BigInteger examp = start.add(BigInteger.valueOf('A')).subtract(BigInteger.valueOf(1));
//        char startChar = (char)examp; // purvata bukva na suobshtenieto
//
//
//        StringBuilder stringb = new StringBuilder();
//        stringb.append(startChar);
//        start.add(BigInteger.valueOf(1));//start++;
//        for (int i = 0; i < lastDigit.subtract(BigInteger.valueOf(1)); i++) {
////            start++;
//            //startChar = (char)(start+'A'-1);
//            if(start>26){
//                start = 1;
//                stringb.append((char)(start+'A'-1));
//                start++;
//            }else{
////                start++;
//                stringb.append((char)(start+'A'-1));
//                start++;
//            }
//        }
//
//
//        if(lastDigit==0) {
//            System.out.println(result);
//            System.out.println("Big Vik wins again!");
//        }else{
//            System.out.println(result);
//            System.out.println(stringb);
//        }
    }
}
