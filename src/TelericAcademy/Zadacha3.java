package TelericAcademy;

import java.util.*;

public class Zadacha3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        //scanner.nextLine();
        for (int i = 0; i < N; i++) {
            String string = scanner.nextLine();
            System.out.println(solve(string));
        }

    }
    public static String solve(String stringExpr) {
        if (stringExpr.isEmpty())
            return "yes";
        Stack<Character> result = new Stack<Character>();
        for (int i = 0; i < stringExpr.length(); i++) {
            char first = stringExpr.charAt(i);
            if (first == '*' || first == '(') {
                result.push(first);
            }
            if (first == '*' || first == ')' || first == ' ') {
                if (result.isEmpty() && first == ')'){
                    return "no";
                }else if(first == '*' || first == ' ') {
                    return "yes";
                }

                char last = result.peek();
                if (first == ')' && last == '(')
                    result.pop();
                else
                    return "no";
            }
        }
        return result.isEmpty()?"yes":"no";
    }
}
