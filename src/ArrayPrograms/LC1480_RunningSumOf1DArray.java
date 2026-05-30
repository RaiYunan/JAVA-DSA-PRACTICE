package ArrayPrograms;

public class LC1480_RunningSumOf1DArray {


    // prefix sum, O(n) time, O(1) space (in-place)
    static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }

    void main() {
        System.out.println(java.util.Arrays.toString(runningSum(new int[]{1, 2, 3, 4})));    // [1, 3, 6, 10]
        System.out.println(java.util.Arrays.toString(runningSum(new int[]{1, 1, 1, 1, 1}))); // [1, 2, 3, 4, 5]
        System.out.println(java.util.Arrays.toString(runningSum(new int[]{3, 1, 2, 10, 1}))); // [3, 4, 6, 16, 17]
    }
}
