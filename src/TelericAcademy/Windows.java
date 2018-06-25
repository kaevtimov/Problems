package TelericAcademy;

import java.util.Scanner;

public class Windows {

    public static long sum = 0;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split(" ");
        long n = Long.parseLong(parts[0]);  // broi prozorci
        long c = Long.parseLong(parts[1]);  // cena na cm2

        for (int i = 0; i < n; i++) {
            String dimensions = scanner.nextLine();
            String[] axb = dimensions.split(" ");
            long heigth = Long.parseLong(axb[0]);
            long width = Long.parseLong(axb[1]);
            byte number = Byte.parseByte(axb[2]);
            long S = heigth*width;
            long price = S*c;
            if(number==1){
                sum+=price;
            }
        }
        System.out.println(sum);
    }
}
