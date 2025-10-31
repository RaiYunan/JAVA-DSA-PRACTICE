package ArrayPrograms;
/**
 * Problem: Remove Duplicates from Sorted Array (LeetCode #26)
 *
 * Given a sorted integer array 'nums', remove duplicates in-place such that each unique
 * element appears only once. Return the number of unique elements (k).
 *
 * Example:
 * Input:  [0,0,1,1,1,2,2,3,3,4]
 * Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
 *
 * Approach:
 * - Since the array is sorted, duplicates will be adjacent.
 * - Use two pointers:
 *      → i : points to the position of the last unique element.
 *      → j : scans the array looking for new unique elements.
 * - When nums[j] != nums[i], increment i and copy nums[j] to nums[i].
 * - After the loop, the number of unique elements = i + 1.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class RemoveDuplicatesSortedArray {
    static int removeDuplicates(int[] nums){
        int n = nums.length;
        if (n < 2) return n;  // Single element or empty → already unique

        int i = 0;  // pointer to last unique index

        for (int j = 1; j < n; j++) {
            if (nums[j] != nums[i]) {
                nums[++i] = nums[j];  // Pre-increment for faster in-place overwrite
            }
        }

        return i + 1;  // count of unique elements
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        System.out.println("Unique count in nums1: " + removeDuplicates(nums1)); // 2
        System.out.println("Unique count in nums2: " + removeDuplicates(nums2)); // 5
    }
}
