package StringPrograms;

public class LC2490_CircularSentence {

    // O(n) time | O(1) space
    static boolean isCircularSentence(String sentence) {
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ')
                if (sentence.charAt(i - 1) != sentence.charAt(i + 1)) return false;
        }
        return sentence.charAt(0) == sentence.charAt(sentence.length() - 1);
    }

    void main() {
        System.out.println(isCircularSentence("leetcode exercises sound delightful")); // true
        System.out.println(isCircularSentence("eetcode"));                             // true
        System.out.println(isCircularSentence("Leetcode is cool"));                    // false
    }
}
