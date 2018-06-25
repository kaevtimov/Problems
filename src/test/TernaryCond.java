package test;

public class TernaryCond {
    public static void main(String[] args) {
        int fuelLevel = 3;
        char result = (fuelLevel > 0) ? 'Y' : 'N';
        System.out.println(result);
    }
}
