package StringPrograms;

public class LC392_IsSubsequence {

    /*
     * check if s is a subsequence of t
     * 1. use two pointers, one for each string
     * 2. advance s pointer only on character match
     * 3. always advance t pointer
     * 4. if s pointer reaches end, all chars matched in order
     *
     * two pointer
     * O(n) time, O(1) space
     */
    static boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) i++;
            j++;
        }
        return i == s.length();
    }

    void main() {
        System.out.println(isSubsequence("ace", "abcde")); // true
        System.out.println(isSubsequence("aec", "abcde")); // false
        System.out.println(isSubsequence("", "abcde"));    // true
    }
}