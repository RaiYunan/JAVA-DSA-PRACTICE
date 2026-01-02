package ArrayPrograms;

/**
 * LeetCode 53: Maximum Subarray
 * Uses Kadane's Algorithm
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class LC_53_MaximumSubArray {

    static int maxSubArray(int[] nums) {

        // currSum: maximum subarray sum ending at current index
        int currSum = nums[0];

        // maxSoFar: maximum subarray sum found so far
        int maxSoFar = nums[0];

        for (int i = 1; i < nums.length; i++) {

            // Decide whether to extend start new from nums[i] or previous subarray
            currSum = Math.max(nums[i], currSum + nums[i]);

            // Update global maximum if needed
            maxSoFar = Math.max(maxSoFar, currSum);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums1));
        // Expected Output: 6  -> [4, -1, 2, 1]

        int[] nums2 = {-8, -3, -6, -2, -5, -4};
        System.out.println(maxSubArray(nums2));
        // Expected Output: -2 -> [-2]

        int[] nums3 = {1, 2, 3, 4};
        System.out.println(maxSubArray(nums3));
        // Expected Output: 10 -> [1, 2, 3, 4]

        int[] nums4 = {-5};
        System.out.println(maxSubArray(nums4));
        // Expected Output: -5
    }
}
