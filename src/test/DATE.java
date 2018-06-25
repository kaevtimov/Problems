package test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DATE {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String date = scanner.nextLine();
        LocalDate local = LocalDate.parse(date, dtf);
        System.out.println(local); // tova e default ISO_LOCAL_DATE(2018-03-03), kogato ne posochim format
        System.out.println(dtf.format(local)); // tuk shte mi go printne vuv formata v koito sum vuvel datata
    }
}
