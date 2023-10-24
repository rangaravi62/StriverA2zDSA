package src.SearchingAlgos;

public class BinarySearchRec {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(BinarySearchRec.binarySearch(arr,0,arr.length-1,0));
    }

    public static int binarySearch(int arr[],int low,int high,int ele){

        if (low > high) return -1;
        int mid = (low+high)/2;
        if (ele == arr[mid]) return mid;
        else if (ele > arr[mid]) return binarySearch(arr,mid+1,high,ele);
        return binarySearch(arr,low,mid-1,ele);
    }
}