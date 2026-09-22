package StringPrograms;

public class LC520_DetectCapital {

    // O(n) time | O(1) space
    static boolean detectCapitalUse(String word) {
        int upper = 0;
        for (char c : word.toCharArray()) if (Character.isUpperCase(c)) upper++;
        return upper == 0 ||
                upper == word.length() ||
                upper == 1 && Character.isUpperCase(word.charAt(0));
    }

    void main() {
        System.out.println(detectCapitalUse("USA"));     // true
        System.out.println(detectCapitalUse("leetcode")); // true
        System.out.println(detectCapitalUse("Google"));  // true
        System.out.println(detectCapitalUse("FlaG"));    // false
    }
}
