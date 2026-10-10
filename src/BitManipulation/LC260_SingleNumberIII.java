package BitManipulation;

public class LC260_SingleNumberIII {

    // O(n) time | O(1) space
    static int[] singleNumber(int[] nums) {
        int xor = 0;
        for (int num : nums) xor ^= num;
        int bit = xor & -xor;
        int a = 0, b = 0;
        for (int num : nums) {
            if ((num & bit) == 0) a ^= num;
            else                  b ^= num;
        }
        return new int[]{a, b};
    }

    void main() {
        System.out.println(java.util.Arrays.toString(singleNumber(new int[]{1, 2, 1, 3, 2, 5}))); // [3, 5]
        System.out.println(java.util.Arrays.toString(singleNumber(new int[]{-1, 0})));             // [-1, 0]
        System.out.println(java.util.Arrays.toString(singleNumber(new int[]{0, 1})));              // [0, 1]
    }
}
