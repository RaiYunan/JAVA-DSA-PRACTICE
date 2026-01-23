package BinarySearch;

public class Q1_BinarySearch {

    public static int search(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<target){
                start=mid+1;

            } else if (arr[mid]>target) {
                end=mid-1;

            }else{
                return mid;
            }

        }
        return -1;


    }
    public static void main(String[] args) {
        int[] arr = {0, 2, 5, 29, 32, 45};
        int target = 45;

        int result = search(arr, target);
        if (result != -1) {
            System.out.printf("Target element '%d' is found in index [%d] of the array", target, result);

        } else {
            System.out.printf("Element %d does not exist in the given array", target);

        }
    }
}