package Stack;

import java.util.Stack;

public class LC921_MinimumAddToMakeParenthesesValid {

    // stack O(n) time | O(n) space
    static int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(c);
            else {
                if (!stack.isEmpty()) stack.pop();
                else                  stack.push(c);
            }
        }
        return stack.size();
    }

    void main() {
        System.out.println(minAddToMakeValid("())"));    // 1
        System.out.println(minAddToMakeValid("((("));    // 3
        System.out.println(minAddToMakeValid("()"));     // 0
        System.out.println(minAddToMakeValid("()))(("));  // 4
    }
}