package ArrayPrograms;

import java.util.ArrayList;
import java.util.List;

public class TargetIndicesAfterSorting {

    // Return indices where target would appear after sorting nums
    public static List<Integer> targetIndices(int[] nums, int target) {
        int countLess = 0;   // numbers < target
        int countEqual = 0;  // numbers == target

        // Count how many are less than and equal to target
        for (int num : nums) {
            if (num < target) {
                countLess++;
            } else if (num == target) {
                countEqual++;
            }
        }

        List<Integer> result = new ArrayList<>();

        // If target not present, return empty list
        if (countEqual == 0) return result;

        for (int i = 0; i < countEqual; i++) {
            result.add(countLess + i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 2, 3};
        int target = 2;

        System.out.println(targetIndices(nums, target)); // [1, 2]
    }
}
