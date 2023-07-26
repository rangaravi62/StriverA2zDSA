package src.SortingTechniques;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={55,34,34,62,92,5,29};
        for (int i = 0; i < arr.length-1; i++) {
            int max = i;
            boolean isSwap = true;
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]){
                    swap(j,j+1,arr);
                    isSwap = false;
                }
            }
            if (isSwap) break;
        }

    }
    public static void swap(int a, int b,int arr[]){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
