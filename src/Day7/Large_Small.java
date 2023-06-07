package Day7;


public class Large_Small {
    public static void main(String[] args){
        int[] arr = {14,12,6,2,3,4,5,1,20};
        int small = arr[0];//14 12 6 2 1
        int large = arr[0];
        for(int i=0;i<arr.length;i++){
            if(small>arr[i]){
                small = arr[i];
            }
            if(arr[i]>large){
                large = arr[i];
            }
        }
        System.out.println(small);
        System.out.println(large);
    }

}
