package StringPrograms;

public class LC2351_FirstLetterToAppearTwice {

    // O(n) time | O(1) space
    static char repeatedCharacter(String s) {
        boolean[] seen = new boolean[26];
        for (char c : s.toCharArray()) {
            if (seen[c - 'a']) return c;
            seen[c - 'a'] = true;
        }
        return ' ';
    }

    void main() {
        System.out.println(repeatedCharacter("abccbaacz")); // c
        System.out.println(repeatedCharacter("abcdd"));     // d
    }
}
