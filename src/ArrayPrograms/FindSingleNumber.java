package ArrayPrograms;

import java.util.Arrays;

public class FindSingleNumber {

    // 🔹 Optimal XOR solution (O(n) time, O(1) space)
    // XOR property: a ^ a = 0, a ^ 0 = a → duplicates cancel out
    static int findSingleNumber1(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; // cancels duplicates
        }
        return result; // only the unique number remains
    }

    // 🔹 Simple sorting + linear search solution (O(n log n) time)
    // After sorting, duplicates come together → compare in pairs
    static int findSingleNumber2(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i + 1]) { // mismatch found
                return nums[i];
            }
        }
        return nums[nums.length - 1]; // if unique number is last
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        System.out.println("Using XOR method → " + findSingleNumber1(nums)); // Output: 5
        System.out.println("Using sorting method → " + findSingleNumber2(nums)); // Output: 5
    }
}
