package src.SortingTechniques;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={55,34,62,92,5,29};
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[min] >arr[j]){
                    min = j;
                }
            }
            if (i!=min) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        Arrays.stream(arr).forEach(i -> System.out.print(i+" "));
    }

}
