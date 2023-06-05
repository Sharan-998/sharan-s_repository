public class Static {
    static int a;

    static int initialize_a(int num){
        a = num;
        return a;
    }

    public static void main(String[] args){
        int num_a = initialize_a(10);
        System.out.println(num_a);
    }



}
