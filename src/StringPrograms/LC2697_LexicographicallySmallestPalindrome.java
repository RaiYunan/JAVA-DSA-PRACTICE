package StringPrograms;

public class LC2697_LexicographicallySmallestPalindrome {

    // two pointer - O(n) time | O(n) space
    static String makeSmallestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            char min = (char) Math.min(chars[left], chars[right]);
            chars[left] = chars[right] = min;
            left++; right--;
        }
        return new String(chars);
    }

    void main() {
        System.out.println(makeSmallestPalindrome("egcfe")); // efcfe
        System.out.println(makeSmallestPalindrome("abcd"));  // abba
        System.out.println(makeSmallestPalindrome("seven")); // neven
    }
}