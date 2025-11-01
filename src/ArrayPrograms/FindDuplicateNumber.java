package ArrayPrograms;

/**
 * Problem: Find the Duplicate Number (LeetCode #287)
 *
 * Given an array nums containing n + 1 integers where each number is in [1, n],
 * return the single duplicate number.
 *
 * Constraints:
 * - You cannot modify the array.
 * - Use only constant extra space.
 *
 * Example:
 * Input:  [1,3,4,2,2]
 * Output: 2
 *
 * Approach (Floyd's Cycle Detection):
 * - Treat the array like a linked list where:
 *      → index = node
 *      → nums[index] = next pointer
 * - Since one number is duplicated, a cycle must exist.
 * - Use Tortoise (slow) and Hare (fast) pointers:
 *      1️⃣ First, find the intersection point inside the cycle.
 *      2️⃣ Then, reset one pointer to start and move both one step at a time.
 *      3️⃣ The node they meet at = duplicate number.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class FindDuplicateNumber {

    static int findDuplicate(int[] nums) {
        // Step 1: Detect intersection point in the cycle
        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];          // Move by 1 step
            fast = nums[nums[fast]];    // Move by 2 steps
        } while (slow != fast);

        // Step 2: Find the entrance to the cycle (duplicate number)
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow; // or fast — both point to the duplicate number
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 4, 2, 2};
        int[] nums2 = {3, 1, 3, 4, 2};
        int[] nums3 = {3, 3, 3, 3, 3};

        System.out.println("Duplicate in nums1: " + findDuplicate(nums1)); // 2
        System.out.println("Duplicate in nums2: " + findDuplicate(nums2)); // 3
        System.out.println("Duplicate in nums3: " + findDuplicate(nums3)); // 3
    }
}
