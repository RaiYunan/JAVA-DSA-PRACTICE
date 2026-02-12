package BitManipulation;

public class LC191_NumberOf1Bits {

    /*
     * Hamming Weight = number of set bits (1s) in binary representation
     * Uses Brian Kernighan’s algorithm
     * Key idea:
     * n & (n - 1) removes the rightmost set bit
     * Loop runs only for number of 1s (optimal)
     */
    static int hammingWeight(int n) {
        int count = 0;

        while (n != 0) {
            n = n & (n - 1); // remove lowest set bit
            count++;
        }
        return count;
    }

    static int hammingWeight2(int n){
        int count = 0;
        int mask = 1;

        for (int i = 0; i < 32; i++) {
            if ((n & mask) != 0) {
                count++;
            }
            mask <<= 1;
        }

        return count;
    }
    /**
     * Recursive version of Kernighan's algorithm
     * Time: O(k) - k = number of set bits
     * Space: O(k) - recursion stack
     */
    static int hammingWeight3(int n) {
        if (n == 0) return 0;
        return 1 + hammingWeight3(n & (n - 1));
    }

    public static void main(String[] args) {
        int num1 = 128; // binary: 10000000
        System.out.println(hammingWeight(num1)); // Output: 1
        System.out.println(hammingWeight2(num1));
        System.out.println(hammingWeight3(num1));
    }
}
