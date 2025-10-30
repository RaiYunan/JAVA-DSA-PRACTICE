package ArrayPrograms;

public class FindMissingNumber {
    /**
     * Returns the missing number from the range [0, n].
     */
    static int missingNumber(int[] nums){
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;  // Sum of first n natural numbers (0 to n)
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;  // The missing number
    }
    public static void main(String[] args){
        int[] arr1 = {3, 0, 1};
        int[] arr2 = {0, 1};
        int[] arr3 = {9, 6, 4, 2, 3, 5, 7, 0, 1};

        System.out.println("Missing number in arr1: " + missingNumber(arr1));
        System.out.println("Missing number in arr2: " + missingNumber(arr2));
        System.out.println("Missing number in arr3: " + missingNumber(arr3));
    }
}
