package Day_8;
public class Reverse_words {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String rs = "";
        String[] splited = s.split(" ");

            for(int i=0;i<splited.length ;i++){
                rs += reverseString(splited[i]) + " ";
            }

            System.out.println(rs);

    }
    static String reverseString(String str){
        char[] ch = str.toCharArray();

        int a_pointer = 0;
        int b_pointer = ch.length -1;
        while(a_pointer<b_pointer){
            char temp = ch[a_pointer];
            ch[a_pointer] = ch[b_pointer];
            ch[b_pointer] = temp;
            a_pointer++;
            b_pointer--;
        }
        String s = String.valueOf(ch);
        return s;
    }

}
