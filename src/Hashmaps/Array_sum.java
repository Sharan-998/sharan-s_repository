package Hashmaps;

public class Array_sum {
    public static void main(String[] args){
    int[] arr = {10,20,30,40,50,60};
    int target = 50;
    int[] tar_arr = new int[2];

    for(int i=0;i<arr.length-1;i++){
        for(int j=arr.length-1;j>i;j--){
            if(arr[i]+arr[j] == target){
                tar_arr[0] = i;
                tar_arr[1] = j;
            }
        }
    }
    for (Integer s : tar_arr) {
        System.out.println(s);
    }


    }

}
