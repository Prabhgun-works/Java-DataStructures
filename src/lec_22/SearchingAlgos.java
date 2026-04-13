package lec_22;

public class SearchingAlgos {
    public static int binarySearch(int[] arr, int x) {
        int start = 0 , end = arr.length - 1;
        while(start < end) {
            int mid = start + (end - start)/2;
            if(arr[mid] == x) {
                return mid;
            }   else if(arr[mid] < x) {
                start = mid+1;
            }   else {
                end = mid -1;
            }

        }
        return -1 ;
    }
    public static void main(String[] args) {
        int[] arr = {1,23,54,123};
        int x = 54;
        System.out.println( "Element found at index " + binarySearch(arr,x));
    }
}
