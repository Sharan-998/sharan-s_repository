package Day7;

public class Rotate_Arr {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        rotateLeft(arr,2,arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    static void rotateLeft(int arr[],int d, int n){
        for(int i =0;i<d;i++){
            rotateOneLeft(arr, n);
        }
    }
    static void rotateOneLeft(int arr[], int n){
        int temp = arr[0];
        int i;
        for(i=0;i<n-1;i++){
            arr[i] = arr[i+1];
        }
        arr[i] = temp;
    }

}
