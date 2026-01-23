package StringPrograms;

public class LC_205_IsIsomorphic {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] mapS = new int[256];
        int[] mapT = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);


            if (mapS[charS] != mapT[charT]) {
                return false;
            }

            mapS[charS] = i + 1;
            mapT[charT] = i + 1;
        }

        return true;
    }
    public static void main(String[] args) {
        LC_205_IsIsomorphic solution = new LC_205_IsIsomorphic();


        System.out.println("Test 1 (egg, add): " + solution.isIsomorphic("egg", "add")); // true
        System.out.println("Test 2 (foo, bar): " + solution.isIsomorphic("foo", "bar")); // false
        System.out.println("Test 3 (paper, title): " + solution.isIsomorphic("paper", "title")); // true
        System.out.println("Test 4 (ab, aa): " + solution.isIsomorphic("ab", "aa")); // false
        System.out.println("Test 5 (empty strings): " + solution.isIsomorphic("", "")); // true
    }
}
