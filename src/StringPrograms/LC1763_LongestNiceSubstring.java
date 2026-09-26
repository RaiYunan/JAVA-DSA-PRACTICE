package StringPrograms;

import java.util.HashSet;
import java.util.Set;

public class LC1763_LongestNiceSubstring {

    // divide and conquer O(n^2) time | O(n) space
    static String longestNiceSubstring(String s) {
        if (s.length() < 2) return "";
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) set.add(c);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!set.contains(Character.toLowerCase(c)) ||
                    !set.contains(Character.toUpperCase(c))) {
                String left  = longestNiceSubstring(s.substring(0, i));
                String right = longestNiceSubstring(s.substring(i + 1));
                return left.length() >= right.length() ? left : right;
            }
        }
        return s;
    }

    void main() {
        System.out.println(longestNiceSubstring("YazaAay")); // aAa
        System.out.println(longestNiceSubstring("Bb"));      // Bb
        System.out.println(longestNiceSubstring("c"));       // ""
        System.out.println(longestNiceSubstring("dDzeE"));   // dD
    }
}