package ArrayPrograms;

public class LC905_SortArrayByParity {

    /*
     * move all even numbers before odd numbers in-place
     * 1. two pointers from both ends
     * 2. if left is odd and right is even, swap them
     * 3. advance left if even, retreat right if odd
     *
     * two pointer in-place partition
     * O(n) time, O(1) space
     */
    static int[] sortArrayByParity(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            if (nums[left] % 2 > nums[right] % 2) {
                int temp    = nums[left];
                nums[left]  = nums[right];
                nums[right] = temp;
            }
            if (nums[left]  % 2 == 0) left++;
            if (nums[right] % 2 == 1) right--;
        }
        return nums;
    }

    void main() {
        System.out.println(java.util.Arrays.toString(sortArrayByParity(new int[]{3, 1, 2, 4}))); // [2, 4, 3, 1]
        System.out.println(java.util.Arrays.toString(sortArrayByParity(new int[]{0})));           // [0]
    }
}
