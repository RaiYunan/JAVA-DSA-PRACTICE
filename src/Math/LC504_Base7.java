package Math;

public class LC504_Base7 {

    // brute force - built-in Integer.toString with radix 7 | O(log n) time | O(log n) space
    static String convertToBase7Brute(int num) {
        return Integer.toString(num, 7);
    }

    // optimal - repeated division by 7, collect remainders, reverse | O(log n) time | O(log n) space
    static String convertToBase7(int num) {
        if (num == 0) return "0";

        StringBuilder ans = new StringBuilder();
        long n = Math.abs((long) num);

        while (n > 0) {
            ans.append(n % 7);
            n /= 7;
        }

        if (num < 0) ans.append("-");

        return ans.reverse().toString();
    }

    void main() {
        System.out.println(convertToBase7Brute(100));  // 202
        System.out.println(convertToBase7Brute(-7));   // -10
        System.out.println(convertToBase7Brute(0));    // 0

        System.out.println(convertToBase7(100));       // 202
        System.out.println(convertToBase7(-7));        // -10
        System.out.println(convertToBase7(0));         // 0
    }
}
