package BitManipulation;

public class LC2980_CheckIfBitwiseORHasTrailingZeros {

    // O(n) time | O(1) space
    static boolean hasTrailingZeros(int[] nums) {
        int evenCount = 0;
        for (int num : nums) {
            if ((num & 1) == 0) if (++evenCount == 2) return true;
        }
        return false;
    }

    void main() {
        System.out.println(hasTrailingZeros(new int[]{1, 2, 3, 4, 5})); // true
        System.out.println(hasTrailingZeros(new int[]{2, 4, 8, 16}));   // true
        System.out.println(hasTrailingZeros(new int[]{1, 3, 5, 7}));    // false
    }
}