package ArrayPrograms;

public class LC209_MinimumSizeSubarraySum {

    /*
     * find shortest subarray with sum >= target
     * 1. expand window by adding nums[right]
     * 2. shrink from left while sum >= target, record min length
     * 3. if no valid subarray found, return 0
     *
     * sliding window (variable size)
     * O(n) time, O(1) space
     */
    static int minSubArrayLen(int target, int[] nums) {
        int left = 0, sum = 0, ans = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= target) {
                ans = Math.min(ans, right - left + 1);
                sum -= nums[left++];
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }

    void main() {
        System.out.println(minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3})); // 2
        System.out.println(minSubArrayLen(4, new int[]{1, 4, 4}));           // 1
        System.out.println(minSubArrayLen(11, new int[]{1, 1, 1, 1, 1}));   // 0
    }
}
