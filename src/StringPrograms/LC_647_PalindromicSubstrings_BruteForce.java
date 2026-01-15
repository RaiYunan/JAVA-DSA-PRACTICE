package StringPrograms;

public class LC_647_PalindromicSubstrings_BruteForce{

    // Brute force approach:
    // Generate all substrings and check if each is a palindrome
    public static int countSubstrings(String s) {
        int count = 0;
        int n = s.length();

        // Fix starting index
        for (int i = 0; i < n; i++) {
            // Fix ending index
            for (int j = i; j < n; j++) {
                if (isPalindrome(s, i, j)) {
                    count++;
                }
            }
        }
        return count;
    }

    // Checks whether substring s[left right] is a palindrome
    private static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] testCases = {
                "abc",
                "aaa",
                "racecar",
                "abba",
                "a"
        };

        for (String test : testCases) {
            System.out.println(
                    "Input: \"" + test + "\" -> Palindromic Substrings: "
                            + countSubstrings(test)
            );
        }
    }
}
