package BinarySearch;

public class Q4_CeilingOfaNumber {
    static int Ceiling(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        if (target > arr[end]) {
            return -1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return arr[mid]; // Target found, return the target
            } else if (arr[mid] < target) {
                start = mid + 1; // Search in the right half
            } else {
                end = mid - 1; // Search in the left half
            }
        }

        // When the loop ends, 'start' points to the smallest element >= target
        return arr[start];
    }
    public static void main(String[] args){
        int[] arr={2,3,4,5,9,14,16,18};
        int target=19;
        System.out.println(Ceiling(arr,target));

    }
}
