package ArrayPrograms;

public class LC_1283_SmallestDivisor_BruteForce {

    // Brute force solution
    public static int smallestDivisor(int[] nums, int threshold) {

        int max = getMax(nums);

        // Try every possible divisor
        for (int divisor = 1; divisor <= max; divisor++) {
            int sum = 0;

            // Compute sum using ceiling division
            for (int num : nums) {
                sum += (num + divisor - 1) / divisor;
            }

            // If condition satisfied, return divisor
            if (sum <= threshold) {
                return divisor;
            }
        }
        return -1; // Problem guarantees an answer, so this won't occur
    }

    // Helper to find maximum value
    private static int getMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        return max;
    }

    // Driver code
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 5, 9};
        int threshold1 = 6;

        System.out.println("Smallest Divisor: " +
                smallestDivisor(nums1, threshold1));
    }
}
