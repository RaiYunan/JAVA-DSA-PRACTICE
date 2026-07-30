package StringPrograms;

import java.util.Stack;

public class LC844_BackspaceStringCompare {

    /*
     * simulate typing with backspace '#' using a string builder
     * 1. iterate chars, append to sb if not '#'
     * 2. if '#' and sb not empty, delete last char
     * 3. compare final built strings
     *
     * string simulation (brute force)
     * O(n+m) time, O(n+m) space
     */
    static String build(String str) {
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch != '#') sb.append(ch);
            else if (!sb.isEmpty()) sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    static boolean backspaceCompareBrute(String s, String t) {
        return build(s).equals(build(t));
    }

    /*
     * simulate typing using explicit stack, pop on '#'
     * 1. push chars onto stack, pop on '#'
     * 2. build string from stack, compare both
     *
     * stack simulation
     * O(n+m) time, O(n+m) space
     */
    static String process(String str) {
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == '#') { if (!stack.isEmpty()) stack.pop(); }
            else             stack.push(ch);
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : stack) sb.append(ch);
        return sb.toString();
    }

    static boolean backspaceCompare(String s, String t) {
        return process(s).equals(process(t));
    }

    void main() {
        System.out.println(backspaceCompareBrute("ab#c", "ad#c")); // true
        System.out.println(backspaceCompareBrute("ab##", "c#d#")); // true
        System.out.println(backspaceCompareBrute("a#c",  "b"));    // false

        System.out.println(backspaceCompare("ab#c", "ad#c")); // true
        System.out.println(backspaceCompare("ab##", "c#d#")); // true
        System.out.println(backspaceCompare("a#c",  "b"));    // false
    }
}