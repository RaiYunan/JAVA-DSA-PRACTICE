package BitManipulation;

public class LC2235_AddTwoIntegers {

    /*
     * add two integers without using + operator
     * 1. XOR gives sum without carry
     * 2. AND + left shift gives carry bits
     * 3. repeat until no carry left
     *
     * bit manipulation: XOR + carry propagation
     * O(log n) time, O(1) space
     */
    static int sum(int num1, int num2) {
        while (num2 != 0) {
            int carry = (num1 & num2) << 1;
            num1 = num1 ^ num2;
            num2 = carry;
        }
        return num1;
    }

    void main() {
        System.out.println(sum(12, 5));  // 17
        System.out.println(sum(-10, 4)); // -6
        System.out.println(sum(0, 0));   // 0
    }
}