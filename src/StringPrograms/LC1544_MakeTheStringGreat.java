package StringPrograms;

public class LC1544_MakeTheStringGreat {

    // O(n) time | O(n) space
    static String makeGood(String s) {
        char[] stack = new char[s.length()];
        int top = 0;
        for (char c : s.toCharArray()) {
            if (top > 0 && Math.abs(stack[top - 1] - c) == 32) top--;
            else stack[top++] = c;
        }
        return new String(stack, 0, top);
    }

    void main() {
        System.out.println(makeGood("leEeetcode")); // leetcode
        System.out.println(makeGood("abBAcC"));     // ""
        System.out.println(makeGood("s"));          // s
    }
}