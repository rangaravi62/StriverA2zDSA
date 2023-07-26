package src.SortingTechniques;

public class MinElement {
    public static void main(String[] args) {
        int arr[]={55,34,62,92,5,29};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
