package StringPrograms;

public class LC696_CountBinarySubstrings {

    // O(n) time | O(1) space
    static int countBinarySubstrings(String s) {
        int prev = 0, curr = 1, result = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) curr++;
            else { result += Math.min(prev, curr); prev = curr; curr = 1; }
        }
        return result + Math.min(prev, curr);
    }

    void main() {
        System.out.println(countBinarySubstrings("00110011")); // 6
        System.out.println(countBinarySubstrings("10101"));    // 4
        System.out.println(countBinarySubstrings("00110"));    // 3
    }
}