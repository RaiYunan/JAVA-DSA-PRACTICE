package ArrayPrograms;

public class LC1991_FindTheMiddleIndexInArray {

    /*
     * find index where left sum equals right sum
     * 1. compute total sum
     * 2. iterate: rightSum = total - leftSum - nums[i]
     * 3. if leftSum == rightSum, return index
     *
     * prefix sum
     * O(n) time, O(1) space
     */
    static int findMiddleIndex(int[] nums) {
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
        System.out.println(findMiddleIndex(new int[]{2, 3, -1, 8, 4})); // 3
        System.out.println(findMiddleIndex(new int[]{1, -1, 4}));       // 2
        System.out.println(findMiddleIndex(new int[]{2, 5}));           // -1
    }
}
