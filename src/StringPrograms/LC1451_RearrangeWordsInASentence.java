package StringPrograms;

import java.util.Arrays;
import java.util.Comparator;

public class LC1451_RearrangeWordsInASentence {

    // sort by length + capitalize first char | O(n log n) time | O(n) space
    static String arrangeWords(String text) {
        String[] words = text.toLowerCase().split(" ");
        Arrays.sort(words, Comparator.comparingInt(String::length));
        String result = String.join(" ", words);
        return Character.toUpperCase(result.charAt(0)) + result.substring(1);
    }

    void main() {
        System.out.println(arrangeWords("Leetcode is cool"));            // Is cool leetcode
        System.out.println(arrangeWords("Keep calm and code on"));       // and on keep calm code
        System.out.println(arrangeWords("To be or not to be"));          // To be or be to not
    }
}
