package Greedy;

public class LC738_MonotoneIncreasingDigits {

    // O(n) time | O(n) space
    static int monotoneIncreasingDigits(int n) {
        char[] digits = String.valueOf(n).toCharArray();
        int mark = digits.length;
        for (int i = digits.length - 1; i > 0; i--) {
            if (digits[i] < digits[i - 1]) {
                digits[i - 1]--;
                mark = i;
            }
        }
        for (int i = mark; i < digits.length; i++) digits[i] = '9';
        return Integer.parseInt(new String(digits));
    }

    void main() {
        System.out.println(monotoneIncreasingDigits(10));   // 9
        System.out.println(monotoneIncreasingDigits(1234)); // 1234
        System.out.println(monotoneIncreasingDigits(332));  // 299
    }
}