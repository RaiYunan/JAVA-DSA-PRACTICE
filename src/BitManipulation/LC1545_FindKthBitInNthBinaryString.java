package BitManipulation;

public class LC1545_FindKthBitInNthBinaryString {

    // O(n) time | O(n) space
    static char findKthBit(int n, int k) {
        if (n == 1) return '0';
        int mid = 1 << (n - 1);
        if (k == mid) return '1';
        if (k <  mid) return findKthBit(n - 1, k);
        char bit = findKthBit(n - 1, (1 << n) - k);
        return bit == '0' ? '1' : '0';
    }

    void main() {
        System.out.println(findKthBit(3, 1)); // 0
        System.out.println(findKthBit(4, 11)); // 1
        System.out.println(findKthBit(2, 3)); // 1
    }
}
