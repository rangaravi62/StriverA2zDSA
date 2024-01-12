package src.Arrays.Easy;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
//        int arr[] = {34,45,22,333,77,444,342,92};
        int arr[] = {7,7,7,7,7};
        int len = arr.length;;


        // ----------- brute force  TC : 0(N*logN )+0(N) = 0(N*logN)
//        Arrays.sort(arr);
//        int largest = arr[len-1];
//        int secLargest = -1;
//        for (int i = arr.length-2; i >=0 ; i--) {
//            if (largest!=arr[i]) {
//                secLargest = arr[i];
//                break;
//            }
//        }
//        System.out.println(secLargest);


        // ---------------  better sol TC : 0(N)

//        int largest = arr[0];
//        int secLargest = -1;
//        for (int i = 1; i < len-1; i++) {
//            if (largest < arr[i]) largest=arr[i];
//        }
//        for (int i = 0; i < len-1; i++) {
//            if (secLargest < arr[i] && arr[i] != largest) secLargest = arr[i];
//
//        }
//        System.out.println(secLargest);



        // -------------- optimal
        int largest = arr[0];
        int secLargest = -1;
        for (int i = 1; i < len-1; i++) {
            if (largest < arr[i]){
                 secLargest = largest;
                largest = arr[i];
            }else {
                if (secLargest<arr[i] && largest !=arr[i]) secLargest =arr[i];
            }

        }
        System.out.println(largest + " "+secLargest);

    }
}
