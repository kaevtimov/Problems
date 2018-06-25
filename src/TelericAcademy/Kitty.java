package TelericAcademy;

import java.util.Arrays;
import java.util.Scanner;

public class Kitty {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        int[] directions = Arrays.stream(scanner.nextLine().split(" "))   // tova sa posokite na dvijenie
                .mapToInt(Integer::parseInt)
                .toArray();

        char[] symbols = path.toCharArray();   //tova e putq sus simvolite
        int currentIndex = 0;
        int jumpsBeforeDeadlock = 0;
        int collectedSouls = 0;
        int collectedFood = 0;
        int deadlocks = 0;
        boolean isDeadlocked = false;

        if(symbols[0]=='x'){
            System.out.println("You are deadlocked, you greedy kitty!");
            System.out.println("Jumps before deadlock: 0");
        }else{
            if(symbols[0]=='@'){
                collectedSouls++;
                symbols[0]=' ';
            }else if(symbols[0]=='*'){
                collectedFood++;
                symbols[0]=' ';
            }
            currentIndex = 0;

            for (int i = 0; i < directions.length; i++) {
                jumpsBeforeDeadlock++;
                directions[i] %= symbols.length;
                currentIndex += directions[i];
                if(currentIndex < 0){
                    currentIndex = currentIndex + symbols.length;
                }else if(currentIndex > symbols.length-1){
                    currentIndex = currentIndex - symbols.length;
                }


                if(symbols[currentIndex]=='@'){
                    collectedSouls++;
                    symbols[currentIndex]=' ';
                }else if(symbols[currentIndex]=='*'){
                    collectedFood++;
                    symbols[currentIndex]=' ';
                }else if(symbols[currentIndex]=='x'){
                    deadlocks++;
                    if(currentIndex%2==0 && collectedSouls>0){
                        collectedSouls--;
                        symbols[currentIndex]='@';
                    }else if(currentIndex%2==0 && collectedSouls<=0){
                        isDeadlocked = true;
                        break;
                        // tuk sme deadlocknati
                    }
                    if(currentIndex%2!=0 && collectedFood>0){
                        collectedFood--;
                        symbols[currentIndex]='*';
                    }else if(currentIndex%2!=0 && collectedFood <= 0){
                        isDeadlocked=true;
                        break;
                        //i tuk sme deadlocknati
                    }
                }
            }
            if(isDeadlocked==false){
                System.out.println("Coder souls collected: " + collectedSouls);
                System.out.println("Food collected: " + collectedFood);
                System.out.println("Deadlocks: " + deadlocks);
            }else if(isDeadlocked==true){
                System.out.println("You are deadlocked, you greedy kitty!");
                System.out.println("Jumps before deadlock: " + jumpsBeforeDeadlock);
            }
        }
    }
}
