package ArrayPrograms;

import java.util.Arrays;

public class LC80_RemoveDuplicatesFromSortedArrayII {

    /*
     * remove duplicates in-place, allow each element at most twice
     * brute force: use temp array to collect valid elements
     * 1. count occurrences of each value
     * 2. copy at most 2 of each into temp
     * 3. write temp back into nums
     *
     * temp array + counting
     * O(n) time, O(n) space
     */
    static int removeDuplicates(int[] nums) {
        int[] temp = new int[nums.length];
        int index = 0;

        for (int i = 0; i < nums.length; ) {
            int count = 0, value = nums[i];
            while (i < nums.length && nums[i] == value) {
                if (count < 2) temp[index++] = value;
                count++;
                i++;
            }
        }

        for (int i = 0; i < index; i++) nums[i] = temp[i];
        return index;
    }

    void main() {
        int[] nums1 = {1, 1, 1, 2, 2, 3};
        int k1 = removeDuplicates(nums1);
        System.out.println(Arrays.toString(Arrays.copyOf(nums1, k1))); // [1, 1, 2, 2, 3]

        int[] nums2 = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        int k2 = removeDuplicates(nums2);
        System.out.println(Arrays.toString(Arrays.copyOf(nums2, k2))); // [0, 0, 1, 1, 2, 3, 3]
    }
}