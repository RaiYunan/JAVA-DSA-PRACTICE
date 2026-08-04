package BitManipulation;

public class LC201_BitwiseANDOfNumbersRange {

    /*
     * find bitwise AND of all numbers in range [left, right]
     * 1. right-shift both until they're equal (find common prefix)
     * 2. differing bits always AND to 0, so strip them
     * 3. left-shift back to restore position
     *
     * bit shift: common prefix detection
     * O(log n) time, O(1) space
     */
    static int rangeBitwiseAnd(int left, int right) {
        int shift = 0;
        while (left != right) {
            left  >>= 1;
            right >>= 1;
            shift++;
        }
        return left << shift;
    }

    void main() {
        System.out.println(rangeBitwiseAnd(5, 7));          // 4
        System.out.println(rangeBitwiseAnd(0, 0));          // 0
        System.out.println(rangeBitwiseAnd(1, 2147483647)); // 0
    }
}