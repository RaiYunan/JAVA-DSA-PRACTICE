package ArrayPrograms;

public class CheckIfArrayIsSortedAndRotated {

    // Check if array is sorted (possibly rotated)
    static boolean check(int[] nums) {
        int count = 0;  // Count breaks in sorted order
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            // Compare with next element (wrap around for last element)
            if (nums[i] > nums[(i + 1) % n]) {
                count++;  // Found a break
            }
        }

        // Valid if 0 breaks (sorted) or 1 break (rotated sorted)
        return count <= 1;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 4, 5, 1, 2};  // true - rotated sorted
        int[] arr2 = {2, 1, 3, 4};     // false - not sorted
        int[] arr3 = {1, 2, 3};        // true - already sorted

        System.out.println(check(arr1)); // true
        System.out.println(check(arr2)); // false
        System.out.println(check(arr3)); // true
    }
}