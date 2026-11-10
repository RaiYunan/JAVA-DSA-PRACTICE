package BitManipulation;

public class LC2429_MinimizeXOR {

    // brute force - O(R) time | O(1) space
    static int minimizeXor(int num1, int num2) {
        int target = Integer.bitCount(num2);
        int min = Integer.MAX_VALUE, result = 0;
        for (int x = 0; x <= 100000; x++) {
            if (Integer.bitCount(x) == target) {
                int value = num1 ^ x;
                if (value < min) { min = value; result = x; }
            }
        }
        return result;
    }

    void main() {
        System.out.println(minimizeXor(3, 5));  // 3
        System.out.println(minimizeXor(1, 12)); // 3
    }
}