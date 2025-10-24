package BinarySearch;

import java.util.Arrays;

public class Qn16_FindSingleElementInSortedArray {

    /**
     * Find the single element in sorted array where all other
     * elements appear exactly twice
     */
    static int singleNonDuplicate(int[] nums) {
        int start = 0, end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            // Ensure mid is even index for pair checking
            if (mid % 2 == 1) mid--;

            // Check if current element pairs with next element
            if (nums[mid] == nums[mid + 1]) {
                // Move right - single element is after this pair
                start = mid + 2;
            } else {
                // Move left - single element is at or before mid
                end = mid;
            }
        }

        return nums[end];
    }

    public static void main(String[] args) {
        // Test cases
        int[] arr1 = {0};
        System.out.println("Array: " + Arrays.toString(arr1) + " | Single: " + singleNonDuplicate(arr1));

        int[] arr2 = {1, 1, 2, 3, 3};
        System.out.println("Array: " + Arrays.toString(arr2) + " | Single: " + singleNonDuplicate(arr2));

        int[] arr3 = {1, 1, 2, 2, 3};
        System.out.println("Array: " + Arrays.toString(arr3) + " | Single: " + singleNonDuplicate(arr3));

        int[] arr4 = {1, 1, 2, 2, 3, 4, 4};
        System.out.println("Array: " + Arrays.toString(arr4) + " | Single: " + singleNonDuplicate(arr4));

        int[] arr5 = {1, 2, 2, 3, 3};
        System.out.println("Array: " + Arrays.toString(arr5) + " | Single: " + singleNonDuplicate(arr5));

        int[] arr6 = {1, 1, 2, 3, 3, 4, 4, 5, 5};
        System.out.println("Array: " + Arrays.toString(arr6) + " | Single: " + singleNonDuplicate(arr6));
    }
}