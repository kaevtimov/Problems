package test;

public class Break {
    public static void main(String[] args) {
        int index = 1;
        int num = 10;
        while (true) {
            if (index == num + 1) {
                break;
            }
            System.out.println(index);
            index++;
        }
    }
}
