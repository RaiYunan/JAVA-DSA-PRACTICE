package StringPrograms;

public class LC1528_ShuffleString {

    /*
     * place each character at its target index given by indices array
     * 1. create result char array of same length
     * 2. map s[i] → result[indices[i]]
     * 3. convert back to string
     *
     * index mapping
     * O(n) time, O(n) space
     */
    static String restoreString(String s, int[] indices) {
        char[] result = new char[s.length()];
        for (int i = 0; i < s.length(); i++) result[indices[i]] = s.charAt(i);
        return new String(result);
    }

    void main() {
        System.out.println(restoreString("codeleet", new int[]{4, 5, 6, 7, 0, 2, 1, 3})); // leetcode
        System.out.println(restoreString("abc", new int[]{0, 1, 2}));                      // abc
    }
}