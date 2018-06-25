package TelericAcademy;

import java.util.HashMap;
import java.util.Scanner;

public class OddNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        HashMap<Long, Long> hmap = new HashMap<>();
        for (long i = 0; i < n; i++) {
            long num = scanner.nextLong();
            if(hmap.get(num)==null){
                hmap.put(num, 1l);
            }else{
                hmap.put(num, hmap.get(num)+1);
            }
        }
        for(Long key : hmap.keySet()){
            if(hmap.get(key)%2!=0){
                System.out.println(key);
                break;
            }
        }
    }
}


