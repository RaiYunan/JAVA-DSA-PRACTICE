package StringPrograms;

public class LC1796_SecondLargestDigitInString {

    // O(n) time | O(1) space
    static int secondHighest(String s) {
        int largest = -1, second = -1;
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) continue;
            int digit = c - '0';
            if (digit > largest)                    { second = largest; largest = digit; }
            else if (digit < largest && digit > second) second = digit;
        }
        return second;
    }

    void main() {
        System.out.println(secondHighest("dfa12321afd")); // 2
        System.out.println(secondHighest("abc1111"));     // -1
        System.out.println(secondHighest("sjhtz901"));    // 1
    }
}