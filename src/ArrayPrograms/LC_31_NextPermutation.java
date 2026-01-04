package ArrayPrograms;

import java.util.Arrays;

/*
  LeetCode 31 - Next Permutation

  Rearranges numbers into the lexicographically next greater permutation.
  If not possible, rearranges into the lowest (ascending) order.

  Time Complexity: O(n)
  Space Complexity: O(1)
 */
public class LC_31_NextPermutation {

    static void nextPermutation(int[] nums) {
        int n = nums.length;

        // STEP 1: Find the first index 'i' from the right
        // such that nums[i] < nums[i + 1]
        int i = n - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // STEP 2: If such index exists, find element just larger than nums[i]
        // and swap them
        if (i >= 0) {
            int j = n - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }

        // STEP 3: Reverse the suffix starting from i+1
        // to get the smallest permutation
        reverse(nums, i + 1, n - 1);
    }

    // Utility method to swap two elements
    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Utility method to reverse a subarray
    static void reverse(int[] nums, int left, int right) {
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        int[][] testCases = {
                {1, 2, 3},
                {3, 2, 1},
                {1, 1, 5},
                {1, 3, 5, 4, 2}
        };

        System.out.println("Next Permutation Results:\n");

        for (int i = 0; i < testCases.length; i++) {
            int[] nums = testCases[i];

            System.out.println("Test Case " + (i + 1));
            System.out.println("Input  : " + Arrays.toString(nums));

            nextPermutation(nums);

            System.out.println("Output : " + Arrays.toString(nums));
            System.out.println("--------------------------------");
        }
    }

}
