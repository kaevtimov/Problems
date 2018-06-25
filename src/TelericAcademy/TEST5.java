package TelericAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Stack;

public class TEST5 {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        //int K = Integer.parseInt(in.readLine());
        //char letter = (char)(K+'A'-1);        // v zavisimost dali iskame glavna ili malka 'A' 'a'

        char letter1 = 'A';
        int number = letter1-'A'+1;
        //System.out.println(letter);

        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        String string = set.toString().replaceAll(", ", " ").replaceAll("\\[", "").replaceAll("\\]", "");
        //System.out.println(string);

        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(4);
        stack.peek();
        stack.peek();
        System.out.println(stack.peek());
        System.out.println(stack.peek());

    }
}
