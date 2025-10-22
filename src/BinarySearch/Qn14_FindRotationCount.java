package BinarySearch;

import java.util.Arrays;

public class Qn14_FindRotationCount {

    // Find rotation count in rotated sorted array
    static int findRotationCount(int[] nums) {
        int start = 0, end = nums.length - 1;

        // Binary search to find index of smallest element
        while (start < end) {
            int mid = start + (end - start) / 2;

            // Minimum is in right half
            if (nums[mid] > nums[end]) {
                start = mid + 1;
            }
            // Minimum is in left half (including mid)
            else {
                end = mid;
            }
        }

        // start points to smallest element = rotation count
        return start;
    }

    public static void main(String[] args) {
        int[] rotatedArray1 = {4, 5, 6, 7, 0, 1, 2, 3};
        int[] rotatedArray2 = {7, 8, 1, 2, 3, 4, 5, 6};

        System.out.println(
                "Number of rotations in " + Arrays.toString(rotatedArray1) +
                        " is " + findRotationCount(rotatedArray1)
        );

        System.out.println(
                "Number of rotations in " + Arrays.toString(rotatedArray2) +
                        " is " + findRotationCount(rotatedArray2)
        );
    }
}
