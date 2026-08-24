package StringPrograms;

public class LC1047_RemoveAllAdjacentDuplicatesInString {

    // stack - O(n) time | O(n) space
    static String removeDuplicates(String s) {
        StringBuilder stack = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.charAt(stack.length() - 1) == c)
                stack.deleteCharAt(stack.length() - 1);
            else
                stack.append(c);
        }
        return stack.toString();
    }

    void main() {
        System.out.println(removeDuplicates("abbaca")); // ca
        System.out.println(removeDuplicates("azxxzy")); // ay
        System.out.println(removeDuplicates("aaa"));    // a
    }
}