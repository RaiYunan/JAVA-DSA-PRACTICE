package StringPrograms;

public class LC2000_ReversePrefixOfWord {

    // two pointer .. O(n) time | O(n) space
    static String reversePrefix(String word, char ch) {
        char[] chars = word.toCharArray();
        int right = 0;
        while (right < chars.length && chars[right] != ch) right++;
        if (right == chars.length) return word;
        int left = 0;
        while (left < right) {
            char temp    = chars[left];
            chars[left]  = chars[right];
            chars[right] = temp;
            left++; right--;
        }
        return new String(chars);
    }

    void main() {
        System.out.println(reversePrefix("abcdefd", 'd')); // dcbaefd
        System.out.println(reversePrefix("xyxzxe", 'z'));  // zxyxe
        System.out.println(reversePrefix("abcd", 'z'));    // abcd
    }
}
