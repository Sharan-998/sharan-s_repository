package Day_6;

public class Fibonacci {

    public static void main(String[] args){
        int N =10;
        for(int i=0;i<N;i++){
            System.out.println(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n){
        if(n<=1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

}
