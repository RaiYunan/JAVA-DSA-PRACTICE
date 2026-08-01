package StringPrograms;

public class LC557_ReverseWordsInAStringIII {

    /*
     * split + reverse each word using StringBuilder.reverse()
     * O(n) time, O(n) space
     */
    static String reverseWordsBrute(String s) {
        String[] words = s.split(" ");
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            ans.append(new StringBuilder(words[i]).reverse());
            if (i != words.length - 1) ans.append(" ");
        }
        return ans.toString();
    }

    /*
     * find each word boundary manually, reverse in-place by iterating backwards
     * 1. track start, find end of word by scanning to space
     * 2. append chars from end to start (reverse order)
     * 3. append space if not last word, advance start
     *
     * two pointer word boundary + manual reverse
     * O(n) time, O(n) space — avoids split() and extra objects
     */
    static String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int start = 0;
        while (start < s.length()) {
            int end = start;
            while (end < s.length() && s.charAt(end) != ' ') end++;
            for (int i = end - 1; i >= start; i--) ans.append(s.charAt(i));
            if (end < s.length()) ans.append(' ');
            start = end + 1;
        }
        return ans.toString();
    }

    void main() {
        System.out.println(reverseWordsBrute("Let's take LeetCode contest")); // s'teL ekat edoCteeL tsetno c
        System.out.println(reverseWordsBrute("Mr Ding"));                     // rM gniD

        System.out.println(reverseWords("Let's take LeetCode contest")); // s'teL ekat edoCteeL tsetno c
        System.out.println(reverseWords("Mr Ding"));                     // rM gniD
    }
}
