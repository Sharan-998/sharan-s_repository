package Day_8;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args){
        String s1 = "iceman";
        String s2 = "cinemaa";
        boolean result;
        if(s1.length()!=s2.length()){
            System.out.println(false);
        }else {
            char[] arr_s1 = s1.toCharArray();
            char[] arr_s2 = s2.toCharArray();
            Arrays.sort(arr_s2);
            Arrays.sort(arr_s1);
            result = Arrays.equals(arr_s2, arr_s1);
            System.out.println(result);
        }
    }


}
