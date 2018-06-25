package test;

import java.util.ArrayList;
import java.util.Scanner;

public class SpellCaster {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        StringBuilder str = new StringBuilder();
        int current=1;
        int max = 1;
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            current=1;
            if(word.length()>max){
                max=word.length();
            }
        }
        int counter = 1;
        while(max>0){
            for (int i = 0; i < words.length; i++) {
                String word = words[i];
                for (int j = word.length()-counter; j >= 0; j--) {
                    char ch = word.charAt(j);
                    str.append(ch);
                    break;
                }
            }counter++;
            max--;
        }
        System.out.println(str);
        String firstStep = "" + str;
        char[] chars = firstStep.toCharArray();
        ArrayList<Character> characters = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            characters.add(chars[i]);
        }

        for (int i = 0; i < characters.size(); i++) {
            char ch = characters.get(i);
            int position = position(ch);
            int newPosition = (position+i)%firstStep.length();
            characters.remove(i);
            characters.add(newPosition, ch);

        }
        for (int i = 0; i < characters.size(); i++) {
            System.out.print(characters.get(i));
        }
    }
        private static int position(char chare){
        String character = String.valueOf(chare).toLowerCase();
            int position = character.charAt(0) - 'a' + 1;
            return position;
    }
}
