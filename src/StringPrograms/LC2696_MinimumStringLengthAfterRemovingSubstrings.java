package StringPrograms;

public class LC2696_MinimumStringLengthAfterRemovingSubstrings {

    // O(n) time | O(n) space
    static int minLength(String s) {
        char[] stack = new char[s.length()];
        int top = 0;
        for (char c : s.toCharArray()) {
            if (top > 0 && ((c == 'B' && stack[top - 1] == 'A') ||
                    (c == 'D' && stack[top - 1] == 'C'))) top--;
            else stack[top++] = c;
        }
        return top;
    }

    void main() {
        System.out.println(minLength("ABFCACDB")); // 2
        System.out.println(minLength("ACBBD"));    // 5
        System.out.println(minLength("ABCD"));     // 0
    }
}
