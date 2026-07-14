package ArrayPrograms;

public class LC643_MaximumAverageSubarrayI {

    /*
     * find max average of any subarray of length k
     * 1. compute sum of first window of size k
     * 2. slide window: add next element, remove first element
     * 3. track max sum, return max/k
     *
     * sliding window
     * O(n) time, O(1) space
     */
    static double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) sum += nums[i];
        int max = sum;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i];
            sum -= nums[i - k];
            max = Math.max(max, sum);
        }
        return (double) max / k;
    }

    void main() {
        System.out.println(findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4)); // 12.75
        System.out.println(findMaxAverage(new int[]{5}, 1));                     // 5.0
    }
}