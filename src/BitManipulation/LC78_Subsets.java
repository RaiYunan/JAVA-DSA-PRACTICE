package BitManipulation;

import java.util.*;

public class LC78_Subsets {

    static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        int total = 1 << n;  // 2^n

        for (int mask = 0; mask < total; mask++) {
            List<Integer> subset = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    subset.add(nums[i]);
                }
            }

            result.add(subset);
        }

        return result;
    }

    void main(String[] args) {
        int[] nums = {1, 2, 3};

        List<List<Integer>> ans = subsets(nums);
        System.out.println(ans);
    }
}