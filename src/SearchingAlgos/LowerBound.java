package src.SearchingAlgos;

public class LowerBound {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int x = 30;
        int lBound = findLowerBoundBFA(arr,x, arr.length);
        System.out.println("Lower Bound is -> "+lBound);

    }

//    public static void main(String[] args) {
//        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int x = 5;
//        boolean lbFound = false;
//        int low = 0;
//        int high = arr.length - 1;
//        int mid = (low + high) / 2;
//        while (low <= high) {
//            if (x > arr[mid]) {
//            }
//        }
//    }

    // worst cae -> 0(N) best -> 0(1)
    public static int findLowerBoundBFA(int arr[],int x,int n){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= x) {
                return i;
            }
        }
        return n;
    }
}
