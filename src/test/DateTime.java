package test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy"); // tuk posochvame v kakuv format da vuvedem datata
        String date = in.nextLine(); // samata data koqto vuvejda potrebitelq
        LocalDate localdate = LocalDate.parse(date, format); // tuk parsvame stringa v data
        LocalDate plus1000days = localdate.plusDays(999); // tuk pribavqme 1000 dni kum datata, koqto sme vuveli
        System.out.println(plus1000days.format(format)); // tuk posochvame v kakuv format da ni pokaje datata
    }
}
