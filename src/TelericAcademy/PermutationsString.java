package TelericAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class PermutationsString {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());
        StringBuilder str = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            str.append(i);
        }
        permute(str.toString());
    }

    public static void permute(String str) {
        StringBuilder stringb = new StringBuilder();
        permutation("", str, stringb);
    }

    public static void permutation(String permutation, String str, StringBuilder sb) {
        if (str.length() == 0) {
            print(permutation, sb);
        } else {
            for (int i = 0; i < str.length(); i++) {
                permutation(permutation + str.charAt(i),
                        str.substring(0, i) + str.substring(i + 1, str.length()), sb);
            }
        }
    }

    public static void print(String str, StringBuilder sb) {
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            sb.append(" ");
        }
        System.out.println(sb
                .deleteCharAt(sb.length() - 1)
                .toString());
        sb.delete(0, sb.length());
    }
}
