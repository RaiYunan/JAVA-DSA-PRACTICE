package ArrayPrograms;

public class LC_1283_SmallestDivisor_BruteForce {

    // Brute force solution
    public static int smallestDivisor(int[] nums, int threshold) {

        int max = 0;
        for (int num : nums) {
            max = Math.max(max, num);
        }

        // Try every possible divisor from 1 to max
        for (int d = 1; d <= max; d++) {
            int sum = 0;

            for (int num : nums) {
                sum += (num + d - 1) / d;  // ceil division
            }

            if (sum <= threshold) {
                return d;  // smallest valid divisor
            }
        }

        return -1; // will never happen due to constraints
    }

    // Driver code
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 5, 9};
        int threshold1 = 6;

        System.out.println("Smallest Divisor: " +
                smallestDivisor(nums1, threshold1));
    }
}
