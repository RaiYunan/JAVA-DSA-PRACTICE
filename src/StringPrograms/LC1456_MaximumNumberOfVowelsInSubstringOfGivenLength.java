package StringPrograms;

public class LC1456_MaximumNumberOfVowelsInSubstringOfGivenLength {

    // sliding window - O(n) time | O(1) space
    static int maxVowels(String s, int k) {
        int count = 0;
        for (int i = 0; i < k; i++) if (isVowel(s.charAt(i))) count++;
        int max = count;
        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i)))     count++;
            if (isVowel(s.charAt(i - k))) count--;
            max = Math.max(max, count);
            if (max == k) return k;
        }
        return max;
    }

    static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    void main() {
        System.out.println(maxVowels("abciiidef", 3)); // 3
        System.out.println(maxVowels("aeiou", 2));     // 2
        System.out.println(maxVowels("leetcode", 3));  // 2
    }
}
