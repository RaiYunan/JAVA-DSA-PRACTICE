package BinarySearch;

public class Qn11_SearchInRotatedSortedArray {


    public static int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Case 1: Found the target
            if (nums[mid] == target) {
                return mid;
            }

            // Check which side is properly sorted
            if (nums[start] <= nums[mid]) {
                // Left side is sorted
                if (nums[start] <= target && target < nums[mid]) {
                    // Target is in the left sorted portion
                    end = mid - 1;
                } else {
                    // Target is in the right portion
                    start = mid + 1;
                }
            } else {
                // Right side is sorted
                if (nums[mid] < target && target <= nums[end]) {
                    // Target is in the right sorted portion
                    start = mid + 1;
                } else {
                    // Target is in the left portion
                    end = mid - 1;
                }
            }
        }
        return -1; // Target not found
    }

    // Alternative: Two-pass approach (find pivot + binary search)
    public static int searchTwoPass(int[] nums, int target) {
        int pivot = findPivot(nums);

        // If no pivot found, array is not rotated
        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        // If pivot is the target
        if (nums[pivot] == target) {
            return pivot;
        }

        // Decide which side to search
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        } else {
            return binarySearch(nums, target, pivot + 1, nums.length - 1);
        }
    }

    private static int findPivot(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            // Array is not rotated
            if (arr[start] <= arr[end]) {
                return -1;
            }

            int mid = start + (end - start) / 2;

            // Check if mid is pivot
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // Decide which side to search
            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    private static int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }


    public static void main(String[] args){
        // Test cases with distinct values
        int[] arr1 = {4, 5, 6, 7, 0, 1, 2};
        int target1 = 0;
        System.out.println("Search " + target1 + " in [4,5,6,7,0,1,2]: " + search(arr1, target1));

        int[] arr2 = {3, 4, 6, 7, 8, 0, 1, 2};
        int target2 = 2;
        System.out.println("Search " + target2 + " in [3,4,6,7,8,0,1,2]: " + search(arr2, target2));

        int[] arr3 = {1, 3};  // Edge case: 2 elements
        int target3 = 3;
        System.out.println("Search " + target3 + " in [1,3]: " + search(arr3, target3));

//         Test two-pass approach
        System.out.println("\nTwo-pass approach:");
        System.out.println("Search " + target1 + " in [4,5,6,7,0,1,2]: " + searchTwoPass(arr1, target1));

    }
}
