package BitManipulation;

public class LC3461_SmallestNumberWithAllSetBits {

    /*
     * find smallest number >= n with all bits set (like 1, 3, 7, 15, 31...)
     * 1. start with result = 1
     * 2. keep shifting left and setting LSB until result >= n
     * 3. each iteration: result = result << 1 | 1 (appends a 1 bit)
     */
    static int smallestNumber(int n) {
        int result = 1;
        while (result < n) result = (result << 1) | 1;
        return result;
    }

    void main() {
        System.out.println(smallestNumber(5));  // 7  (111)
        System.out.println(smallestNumber(10)); // 15 (1111)
        System.out.println(smallestNumber(1));  // 1  (1)
        System.out.println(smallestNumber(16)); // 31 (11111)
    }
}