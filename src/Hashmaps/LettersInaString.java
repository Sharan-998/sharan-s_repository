package Hashmaps;

import java.util.HashMap;

public class LettersInaString {
    public static void main(String[] args){
        HashMap<Character, Integer> letters = new HashMap<>();
        String input = "test string";
        for(int i=0;i<input.length();i++){
            int j = 1;
            if(letters.containsKey(input.charAt(i))){
                j = letters.get(input.charAt(i));
                letters.put(input.charAt(i),j+1);
            }else{
                letters.put(input.charAt(i),j);
            }
        }
        System.out.println(letters);

    }
}
