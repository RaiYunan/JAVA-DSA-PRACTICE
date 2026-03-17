package Stack;

import java.util.Stack;

public class LC20_Valid_Parentheses {
    static boolean isValid(String s) {
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
    void main(){
        String s1="()[]{}";
        String s2="([)]";
        System.out.println(isValid(s1));
        System.out.println(isValid(s2));
    }
}
