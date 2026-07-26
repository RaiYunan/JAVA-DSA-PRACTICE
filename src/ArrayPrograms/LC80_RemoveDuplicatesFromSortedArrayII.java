package ArrayPrograms;

import java.util.Arrays;

public class LC80_RemoveDuplicatesFromSortedArrayII {

    /*
     * brute: count each value, copy at most 2 into temp, write back
     * O(n) time, O(n) space
     */
    static int removeDuplicatesBrute(int[] nums) {
        int[] temp = new int[nums.length];
        int index = 0;
        for (int i = 0; i < nums.length; ) {
            int count = 0, value = nums[i];
            while (i < nums.length && nums[i] == value) {
                if (count < 2) temp[index++] = value;
                count++; i++;
            }
        }
        for (int i = 0; i < index; i++) nums[i] = temp[i];
        return index;
    }

    /*
     * optimal: compare nums[i] with nums[k-2], keep if different
     * O(n) time, O(1) space
     */
    static int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;
        int k = 2;
        for (int i = 2; i < nums.length; i++)
            if (nums[i] != nums[k - 2]) nums[k++] = nums[i];
        return k;
    }

    void main() {
        int[] n1 = {1, 1, 1, 2, 2, 3};
        int[] n2 = {0, 0, 1, 1, 1, 1, 2, 3, 3};

        System.out.println(Arrays.toString(Arrays.copyOf(n1, removeDuplicatesBrute(n1)))); // [1, 1, 2, 2, 3]
        System.out.println(Arrays.toString(Arrays.copyOf(n2, removeDuplicatesBrute(n2)))); // [0, 0, 1, 1, 2, 3, 3]

        int[] n3 = {1, 1, 1, 2, 2, 3};
        int[] n4 = {0, 0, 1, 1, 1, 1, 2, 3, 3};

        System.out.println(Arrays.toString(Arrays.copyOf(n3, removeDuplicates(n3)))); // [1, 1, 2, 2, 3]
        System.out.println(Arrays.toString(Arrays.copyOf(n4, removeDuplicates(n4)))); // [0, 0, 1, 1, 2, 3, 3]
    }
}