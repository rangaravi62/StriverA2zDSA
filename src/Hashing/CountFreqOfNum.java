package src.Hashing;

import java.util.Arrays;

public class CountFreqOfNum {
    public static void main(String[] args) {
        int num[] = {11, 14, 8, 3, 12, 14, 1, 7, 4, 3};
        int arr[] = countFrequency(num.length, 14,num);
        for (int i:arr) {
            System.out.println(i);

        }

    }


    // n-> number of elements x -> highest number
    public static int[] countFrequency(int n, int x, int nums[]){
        int freqArr[] = new int[n] ;
        for (int i :nums) {
            if (i<=n) freqArr[i - 1]++;
        }
        return freqArr;
    }
}
