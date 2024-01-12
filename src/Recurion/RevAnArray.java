package src.Recurion;

import java.util.Arrays;

public class RevAnArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        revArrUsingRec(arr,0);
        System.out.println(Arrays.toString(arr));
    }

    //TC -> 0(N)
    static void revArr(int[] arr){
        int len = arr.length;
        for (int i = 0; i < len/2; i++) {
            int temp = arr[i];
            arr[i] = arr[len-i-1];
            arr[len-i-1]=temp;
        }

    }

    //TC -> 0(N)
    static void revArrUsingRec(int[] arr,int index){
        int len = arr.length;
        if (index >= len/2) return;
        int temp = arr[index];
        arr[index] = arr[len-index-1];
        arr[len-index-1]=temp;
        revArrUsingRec(arr,index+1);
    }
}
