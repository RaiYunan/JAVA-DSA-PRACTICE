package StringPrograms;

import java.util.Stack;

public class LC2390_RemovingStarsFromAString {

    // stack: push chars, pop on '*' → O(n) time, O(n) space
    static String removeStarsStack(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '*') stack.pop();
            else           stack.push(ch);
        }
        StringBuilder sb = new StringBuilder();
        for (char c : stack) sb.append(c);
        return sb.toString();
    }

    void main() {
        System.out.println(removeStarsStack("leet**cod*e")); // lecoe
        System.out.println(removeStarsStack("erase*****"));  // (empty)
    }
}
