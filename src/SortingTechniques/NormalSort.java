package src.SortingTechniques;

import java.util.Arrays;

public class NormalSort {
    public static void main(String[] args) {
        int arr[]={55,34,62,92,5,29};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]= temp;
                }
            }
        }
        Arrays.stream(arr).forEach(i -> System.out.print(i+" "));
    }
}
