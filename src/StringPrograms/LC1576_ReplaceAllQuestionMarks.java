package StringPrograms;

public class LC1576_ReplaceAllQuestionMarks {

    // greedy - replace '?' with first char not matching neighbors | O(n) time | O(n) space
    static String modifyString(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '?') continue;
            for (char c = 'a'; c <= 'c'; c++) {
                if ((i == 0 || chars[i - 1] != c) &&
                        (i == chars.length - 1 || chars[i + 1] != c)) {
                    chars[i] = c;
                    break;
                }
            }
        }
        return new String(chars);
    }

    void main() {
        System.out.println(modifyString("?zs"));   // azs
        System.out.println(modifyString("ubv?w")); // ubvaw
        System.out.println(modifyString("j?qg??b")); // jaqgacb
    }
}
