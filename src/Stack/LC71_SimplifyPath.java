package Stack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class LC71_SimplifyPath {
    // brute force - list as manual stack, join at end | O(n) time | O(n) space
    static String simplifyPathBrute(String path) {
        String[] parts = path.split("/");
        List<String> list = new ArrayList<>();
        for (String part : parts) {
            if (part.equals("") || part.equals(".")) continue;
            else if (part.equals("..")) { if (!list.isEmpty()) list.remove(list.size() - 1); }
            else list.add(part);
        }
        return "/" + String.join("/", list);
    }

    // optimal - deque stack, insert at front while building result
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
