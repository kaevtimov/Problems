package TelericAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Brackets1 {
    public static HashSet<String> brackets = new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        generateExpression("", n);
        brackets.forEach(System.out::println);
    }

    static HashSet<String> generateExpression(String expression, int n) {
        if (expression.length() == n) {
            brackets.add(expression);
        }else {
            HashSet<String> currentBrackets = generateExpression(expression + "()", n);
            brackets.addAll(currentBrackets);

            currentBrackets = generateExpression("()" + expression, n);
            brackets.addAll(currentBrackets);

            currentBrackets = generateExpression("(" + expression + ")", n);
            brackets.addAll(currentBrackets);
        }
        return brackets;
    }
}
