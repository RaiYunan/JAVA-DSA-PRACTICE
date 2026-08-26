package StringPrograms;
import java.util.HashSet;

public class LC2716_MinimizeStringLength {

    // hashset - O(n) time | O(n) space
    static int minimizedStringLength(String s) {
        HashSet<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) set.add(c);
        return set.size();
    }

    void main() {
        System.out.println(minimizedStringLength("aaabc")); // 3
        System.out.println(minimizedStringLength("cbbd"));  // 3
        System.out.println(minimizedStringLength("ddddd")); // 1
    }
}