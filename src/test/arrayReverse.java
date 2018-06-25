package test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class arrayReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        List myList = new ArrayList();
        List myList1 = new ArrayList();

        Matcher m = Pattern.compile("(?!=\\d\\.\\d\\.)([\\d.]+)").matcher(numbers);
        while (m.find())
        {
            double d = Double.parseDouble(m.group(1));
            myList.add(d);
        }
        System.out.println(myList);

        for (int index = myList.size()-1; index >= 0; index--) {
            myList1.add(myList.get(index));
        }
        String numbers2 = "" + myList1;
        String complete = numbers2.replace(".0", "").replace("[", "").replace("]", "");
        System.out.println(complete);
    }
}
