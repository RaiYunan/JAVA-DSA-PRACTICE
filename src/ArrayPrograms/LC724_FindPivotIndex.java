package ArrayPrograms;

public class LC724_FindPivotIndex {

    /*
     * find index where left sum equals right sum
     * 1. compute total sum
     * 2. track leftSum, derive rightSum = total - leftSum - nums[i]
     * 3. if leftSum == rightSum, return index
     *
     * prefix sum
     * O(n) time, O(1) space
     */
    static int pivotIndex(int[] nums) {
        int total = 0;
        for (int num : nums) total += num;
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == total - leftSum - nums[i]) return i;
            leftSum += nums[i];
        }
        return -1;
    }

    void main() {
        System.out.println(pivotIndex(new int[]{1, 7, 3, 6, 5, 6})); // 3
        System.out.println(pivotIndex(new int[]{1, 2, 3}));           // -1
        System.out.println(pivotIndex(new int[]{2, 1, -1}));          // 0
    }
}