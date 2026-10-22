package StringPrograms;

public class LC1750_MinimumLengthOfStringAfterDeletingSimilarEnds {

    // two pointer - O(n) time | O(1) space
    static int minimumLength(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right && s.charAt(left) == s.charAt(right)) {
            char ch = s.charAt(left);
            while (left <= right && s.charAt(left)  == ch) left++;
            while (left <= right && s.charAt(right) == ch) right--;
        }
        return right - left + 1;
    }

    void main() {
        System.out.println(minimumLength("ca"));         // 2
        System.out.println(minimumLength("cabaabac"));   // 0
        System.out.println(minimumLength("aabccabba"));  // 3
    }
}
