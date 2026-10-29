package StringPrograms;

public class LC3856_TrimTrailingVowels {

    // O(n) time | O(n) space
    static String trimTrailingVowels(String s) {
        int i = s.length() - 1;
        while (i >= 0 && "aeiou".indexOf(s.charAt(i)) != -1) i--;
        return s.substring(0, i + 1);
    }

    void main() {
        System.out.println(trimTrailingVowels("idea"));  // id
        System.out.println(trimTrailingVowels("day"));   // day
        System.out.println(trimTrailingVowels("aeiou")); // ""
    }
}