package test;

public class SumNum {
    public static void main(String[] args){
        int index = 15;
        int sum = 0;
        int num = 1;
        while (num <= index) {
            sum += num;
            num = num + 1;
        }
        System.out.println(sum);

    }
}
