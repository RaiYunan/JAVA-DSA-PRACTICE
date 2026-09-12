package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class LC71_SimplifyPath {

    // O(n) time | O(n) space
    static String simplifyPath(String path) {
        Deque<String> stack = new ArrayDeque<>();
        for (String part : path.split("/")) {
            if (part.equals("") || part.equals(".")) continue;
            if (part.equals("..")) { if (!stack.isEmpty()) stack.pop(); }
            else                     stack.push(part);
        }
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) result.insert(0, "/" + stack.pop());
        return result.length() == 0 ? "/" : result.toString();
    }

    void main() {
        System.out.println(simplifyPath("/home/"));           // /home
        System.out.println(simplifyPath("/home//foo/"));      // /home/foo
        System.out.println(simplifyPath("/home/user/Documents/../Pictures")); // /home/user/Pictures
        System.out.println(simplifyPath("/../"));             // /
    }
}
