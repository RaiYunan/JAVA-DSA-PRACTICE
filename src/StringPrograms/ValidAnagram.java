package StringPrograms;

public class ValidAnagram {

    // Check if two strings are anagrams (only lowercase a-z)
    static boolean isAnagram(String s, String t) {
        // Different length -> cannot be anagram
        if (s.length() != t.length()) return false;

        // Count frequency of each letter
        int[] count = new int[26];

        // Update counts for both strings
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++; // char from s
            count[t.charAt(i) - 'a']--; // char from t
        }

        // All counts must be zero for an anagram
        for (int c : count) {
            if (c != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "silent", t1 = "listen";   // anagram
        String s2 = "rat", t2 = "car";         // not anagram
        String s3 = "anagram", t3 = "nagaram"; // anagram
        String s4 = "abc", t4 = "ab";          // different length

        System.out.println(s1 + " & " + t1 + " -> " + isAnagram(s1, t1));
        System.out.println(s2 + " & " + t2 + " -> " + isAnagram(s2, t2));
        System.out.println(s3 + " & " + t3 + " -> " + isAnagram(s3, t3));
        System.out.println(s4 + " & " + t4 + " -> " + isAnagram(s4, t4));
    }
}
