package StringPrograms;

public class LC2243_CalculateDigitSumOfAString {

    // O(n) time per round | O(n) space
    static String digitSum(String s, int k) {
        while (s.length() > k) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i += k) {
                int sum = 0;
                for (int j = i; j < Math.min(i + k, s.length()); j++) sum += s.charAt(j) - '0';
                sb.append(sum);
            }
            s = sb.toString();
        }
        return s;
    }

    void main() {
        System.out.println(digitSum("11111222223", 3)); // 135
        System.out.println(digitSum("00000000", 3));    // 000
        System.out.println(digitSum("1234", 4));        // 1234
    }
}
