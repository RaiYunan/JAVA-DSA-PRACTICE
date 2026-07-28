package StringPrograms;

public class LC1768_MergeStringsAlternately {

    /*
     * merge two strings by alternating characters, append remainder
     * 1. iterate up to max length of both strings
     * 2. append word1[i] if exists, then word2[i] if exists
     *
     * two pointer simulation
     * O(n+m) time, O(n+m) space
     */
    static String mergeAlternately(String word1, String word2) {
        StringBuilder ans = new StringBuilder();
        int max = Math.max(word1.length(), word2.length());
        for (int i = 0; i < max; i++) {
            if (i < word1.length()) ans.append(word1.charAt(i));
            if (i < word2.length()) ans.append(word2.charAt(i));
        }
        return ans.toString();
    }

    void main() {
        System.out.println(mergeAlternately("abc", "pqr"));  // apbqcr
        System.out.println(mergeAlternately("ab", "pqrs"));  // apbqrs
        System.out.println(mergeAlternately("abcd", "pq"));  // apbqcd
    }
}
