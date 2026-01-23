package BinarySearch;

public class Qn15_SplitArray_LargestSum {
    static int splitArray(int[] nums, int k) {
        // Find the possible range for the largest subarray sum
        int maxElement = 0;  // Largest single element (minimum possible answer)
        int totalSum = 0;    // Total sum of array (maximum possible answer)

        for (int num : nums) {
            maxElement = Math.max(maxElement, num);
            totalSum += num;
        }

        // Binary Search between maxElement and totalSum
        int start = maxElement;
        int end = totalSum;
        int result = totalSum;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if we can split array with max subarray sum <= mid
            if (canSplit(nums, k, mid)) {
                result = mid;  // Found a valid split, try for smaller sum
                end = mid - 1;
            } else {
                start = mid + 1;  // Need larger sum to split
            }
        }

        return result;
    }

    // Helper function to check if we can split array into <= k subarrays
    // with each subarray sum <= maxSum
    static boolean canSplit(int[] nums, int k, int maxSum) {
        int subarrayCount = 1;  // Start with first subarray
        int currentSum = 0;

        for (int num : nums) {

            // If adding this number exceeds maxSum, start new subarray
            if (currentSum+num > maxSum) {
                subarrayCount++;
                currentSum = num;  // Start new subarray with current number

                // If we need more than k subarrays, it's not possible
                if (subarrayCount > k) {
                    return false;
                }
            }else{
                currentSum += num;
            }
        }

        return true;
    }

    public static void main(String[] args) {


        // Test cases
        int[] nums1 = {7, 2, 5, 10, 8};
        System.out.println(splitArray(nums1, 2)); // Output: 18

        int[] nums2 = {1, 2, 3, 4, 5};
        System.out.println(splitArray(nums2, 2)); // Output: 9

        int[] nums3 = {1, 4, 4};
        System.out.println(splitArray(nums3, 3)); // Output: 4
    }
}
