package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Stack;

public class SMS {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String string = in.readLine();
        System.out.println(solve(string));

    }
    public static BigDecimal solve(String mathExpression) {
        char[] array = mathExpression.toCharArray();
        Stack<BigDecimal> values = new Stack<>();
        Stack<Character> signs = new Stack<>();

        for (int i = 0; i < array.length; i++){
            if (array[i] == ' '){        // ako imame whitespace mejdu
                continue;
            }
            if (array[i] >= '0' && array[i] <= '9') {       // tova se pravi ako imame dvu ili tricifreno chislo
                StringBuffer sbuf = new StringBuffer();
                while (i < array.length && array[i] >= '0' && array[i] <= '9')
                    sbuf.append(array[i++]);  // vajno i++ zashtoto ni promenq i gore
                i--;    // tova ni maha whitespace ako imame
                values.push(BigDecimal.valueOf(Long.parseLong(sbuf.toString())));
            }
            else if (array[i] == '('){
                signs.push(array[i]);
            }
            else if (array[i] == ')') {
                while (signs.peek() != '(')
                    values.push(returnValues(signs.pop(), values.pop(), values.pop()));
                signs.pop();
            }
            else if (array[i] == '+' || array[i] == '-' ||
                    array[i] == '*' || array[i] == '/') {
                while (!signs.empty() && operators(array[i], signs.peek()))
                    values.push(returnValues(signs.pop(), values.pop(), values.pop()));
                signs.push(array[i]);
            }
        }
        while (!signs.empty()){
            values.push(returnValues(signs.pop(), values.pop(), values.pop()));
        }
        return values.pop();
    }
    public static boolean operators(char operator1, char operator2) {
        if (operator2 == '(' || operator2 == ')'){
            return false;
        }
        if ((operator1 == '*' || operator1 == '/') && (operator2 == '+' || operator2 == '-')){
            return false;
        }
        else{
            return true;
        }
    }
    public static BigDecimal returnValues(char operator, BigDecimal number2, BigDecimal number1) {
        switch(operator){
            case '+':
                return number1.add(number2);
            case '-':
                return number1.subtract(number2);
            case '*':
                return number1.multiply(number2);
            case '/':
                if (number2.equals(0)){
                    return BigDecimal.valueOf(0);
                }
                return number1.divide(number2);
        }
        return BigDecimal.valueOf(0);
    }
}
