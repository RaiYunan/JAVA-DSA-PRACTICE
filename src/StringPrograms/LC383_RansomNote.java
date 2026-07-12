package StringPrograms;

public class LC383_RansomNote {

    static boolean canConstructBruteForce(String ransomNote, String magazine) {
        char[] m = magazine.toCharArray();
        for (int i = 0; i < ransomNote.length(); i++) {
            boolean found = false;
            for (int j = 0; j < m.length; j++) {
                if (ransomNote.charAt(i) == m[j]) {
                    found = true;
                    m[j] = '#';
                    break;
                }
            }
            if (!found) return false;
        }
        return true;
    }

    void main() {
        System.out.println(canConstructBruteForce("a", "b"));    // false
        System.out.println(canConstructBruteForce("aa", "ab"));  // false
        System.out.println(canConstructBruteForce("aa", "aab")); // true
    }
}