package ArrayPrograms;

/*
  LeetCode 560 - Subarray Sum Equals K

  Brute force approach:
  Try all possible subarrays and count those whose sum equals k.

  Time Complexity: O(n^2)
  Space Complexity: O(1)
 */
public class LC_560_SubArrayEqualsK {

    static int subarraySum(int[] nums, int k) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int j = i; j < n; j++) {
                sum += nums[j];

                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 1};
        int[] arr2 = {1, 2, 3};

        System.out.println("Result for [1,1,1], k=2 : " + subarraySum(arr1, 2));
        System.out.println("Result for [1,2,3], k=3 : " + subarraySum(arr2, 3));
    }
}
