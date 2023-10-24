package src.SearchingAlgos;

public class FindXInASortedArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int low = 0;
        int high = arr.length - 1;
        int mid ;
        int X = -1;
        int searchEle = 9;
        while (low <= high) {
            mid = (low + high) / 2;
            if (searchEle == arr[mid]) {
                X = mid;
                break;
            } else if (searchEle > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (X == -1) System.out.println("Element is not pXent");
        else System.out.println("Element -> "+arr[X] +" found at the index -> "+X);
    }
}
