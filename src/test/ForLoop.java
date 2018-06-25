package test;

public class ForLoop {
    public static void main(String[] args) {
        int num = 5;
        int step = 3;
        long result = 1;
        for(int index = 0; index < step; index++){
            result *= num;
        }
        System.out.println("num ^ step = " + result);
    }
}
