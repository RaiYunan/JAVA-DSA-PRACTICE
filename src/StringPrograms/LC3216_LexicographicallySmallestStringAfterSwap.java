package StringPrograms;

public class LC3216_LexicographicallySmallestStringAfterSwap {

    // O(n) time | O(n) space
    static String getSmallestString(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            if ((chars[i] - '0') % 2 == (chars[i + 1] - '0') % 2 && chars[i] > chars[i + 1]) {
                char temp  = chars[i];
                chars[i]   = chars[i + 1];
                chars[i + 1] = temp;
                break;
            }
        }
        return new String(chars);
    }

    void main() {
        System.out.println(getSmallestString("45320")); // 43520
        System.out.println(getSmallestString("001"));   // 001
        System.out.println(getSmallestString("531"));   // 351
    }
}
