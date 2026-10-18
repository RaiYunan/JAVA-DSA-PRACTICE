package BitManipulation;

public class LC693_BinaryNumberWithAlternatingBits {

    // xor shift - O(1) time | O(1) space
    static boolean hasAlternatingBits(int n) {
        int x = n ^ (n >> 1);
        return (x & (x + 1)) == 0;
    }

    void main() {
        System.out.println(hasAlternatingBits(5));  // true  (101)
        System.out.println(hasAlternatingBits(7));  // false (111)
        System.out.println(hasAlternatingBits(11)); // false (1011)
        System.out.println(hasAlternatingBits(10)); // true  (1010)
    }
}
