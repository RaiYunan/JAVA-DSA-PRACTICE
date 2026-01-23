package ArrayPrograms;

public class FirstMissingPositive {
    // Function to find the smallest missing positive integer
    static int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // Step 1: Replace negative numbers and zeros with n+1
        // (since valid numbers are in range [1, n])
        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0 || nums[i] > n) {
                nums[i] = n + 1;
            }
        }

        // Step 2: Mark presence using index
        // For every num in array, mark nums[num-1] as negative
        for (int i = 0; i < n; i++) {
            int num = Math.abs(nums[i]);
            if (num >= 1 && num <= n) {
                nums[num - 1] = -Math.abs(nums[num - 1]);
            }
        }

        // Step 3: The first positive index means missing number = index + 1
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) return i + 1;
        }

        // Step 4: If all positions are marked, missing number is n+1
        return n + 1;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 0};
        int[] nums2 = {3, 4, -1, 1};
        int[] nums3 = {7, 8, 9, 11, 12};

        System.out.println(firstMissingPositive(nums1)); // Output: 3
        System.out.println(firstMissingPositive(nums2)); // Output: 2
        System.out.println(firstMissingPositive(nums3)); // Output: 1
    }
}
