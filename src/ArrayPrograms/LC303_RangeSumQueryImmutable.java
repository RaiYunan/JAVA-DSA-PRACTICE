package ArrayPrograms;

public class LC303_RangeSumQueryImmutable {

    /*
     * precompute prefix sums for O(1) range queries
     * 1. prefix[i+1] = prefix[i] + nums[i]
     * 2. sumRange(l, r) = prefix[r+1] - prefix[l]
     *
     * prefix sum
     * O(n) build time, O(1) query time, O(n) space
     */
    static class NumArray {
        private int[] prefix;

        NumArray(int[] nums) {
            prefix = new int[nums.length + 1];
            for (int i = 0; i < nums.length; i++) prefix[i + 1] = prefix[i] + nums[i];
        }

        int sumRange(int left, int right) {
            return prefix[right + 1] - prefix[left];
        }
    }

    void main() {
        NumArray obj = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
        System.out.println(obj.sumRange(0, 2));  // 1
        System.out.println(obj.sumRange(2, 5));  // -1
        System.out.println(obj.sumRange(0, 5));  // -3
    }
}
