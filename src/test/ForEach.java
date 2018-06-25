package test;

public class ForEach {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        String result = "";
        for(int number: numbers) {
            result += number + ", ";
        }
        System.out.println(result.substring(result.length() - ", ".length())); // za da se mahne poslednata zapetaq
    }
}