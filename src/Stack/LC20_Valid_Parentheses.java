package Stack;

import java.util.Stack;

public class LC20_Valid_Parentheses {
    static boolean isValid1(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;

                char top = stack.pop();
                if (c == ')' && top != '(') return false;
                if (c == '}' && top != '{') return false;
                if (c == ']' && top != '[') return false;
            }
        }

        return stack.isEmpty();
    }


    static boolean isValid2(String s) {

        char[] stack = new char[s.length()];
        int top = -1;

        for (char ch : s.toCharArray()) {

            if (ch == '(') stack[++top] = ')';
            else if (ch == '{') stack[++top] = '}';
            else if (ch == '[') stack[++top] = ']';
            else {
                if (top == -1 || stack[top--] != ch) {
                    return false;
                }
            }
        }

        return top == -1;
    }

    void main() {
        String s1 = "()[]{}";
        String s2 = "([)]";
        System.out.println(isValid1(s1));
        System.out.println(isValid2(s2));
    }
}
