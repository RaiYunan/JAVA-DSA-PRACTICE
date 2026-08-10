package ArrayPrograms;

public class LC1295_FindNumbersWithEvenNumberOfDigits {

    /*
     * count numbers that have an even number of digits
     * 1. check if number falls in even-digit ranges (2,4,6 digits)
     * 2. given constraint 1 <= nums[i] <= 10^5, only 2 and 4 digit ranges apply
     *
     * range check
     * O(n) time, O(1) space
     */
    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums)
            if ((num >= 10 && num <= 99) || (num >= 1000 && num <= 9999)) count++;
        return count;
    }

    void main() {
        System.out.println(findNumbers(new int[]{12, 345, 2, 6, 7896})); // 2
        System.out.println(findNumbers(new int[]{555, 901, 482, 1771})); // 1
    }
}
