package TelericAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Wildcard {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String string = in.readLine();
        String pattern = in.readLine();

        boolean isTrue = true;

        for (int i = 0; i < string.length(); i++) {
            char ch1 = string.charAt(i);
            char ch2 = pattern.charAt(i);
            if(ch1!=ch2){
                if(ch2=='*' || ch2=='?' || pattern.charAt(i-1)=='*'){
                    continue;
                }else{
                    isTrue=false;
                }
            }
        }
        System.out.println(isTrue);
    }
}
