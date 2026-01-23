package ArrayPrograms;

public class FindMaxConsecutiveOnes {

    static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;  // Stores the maximum sequence length
        int currentCount = 0; // Tracks current streak of 1's

        for (int num : nums) {
            if (num == 1) {
                currentCount++; // Increment current streak
                maxCount = Math.max(maxCount, currentCount); // Update max if needed
            } else {
                currentCount = 0; // Reset streak when 0 is found
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 0, 1, 1, 1};
        int[] nums2 = {1, 0, 1, 1, 0, 1};

        System.out.println(findMaxConsecutiveOnes(nums1)); // Output: 3
        System.out.println(findMaxConsecutiveOnes(nums2)); // Output: 2
    }
}
