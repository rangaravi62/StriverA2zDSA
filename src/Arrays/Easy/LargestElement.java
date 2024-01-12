package src.Arrays.Easy;

import java.util.Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int arr[] = {34,45,22,333,77,444,342,92};


        // brute force TC : 0(N*log(N))
//        Arrays.sort(arr);
//        System.out.println(arr[arr.length-1]);

        // optimal TC : 0(N)
        int max = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            if(max < arr[i+1]) max = arr[i+1];
        }
        System.out.println(max);
    }
}
