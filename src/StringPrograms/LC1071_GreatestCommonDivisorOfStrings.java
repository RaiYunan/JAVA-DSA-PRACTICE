package StringPrograms;

public class LC1071_GreatestCommonDivisorOfStrings {

    // O(n) time | O(n) space
    static String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) return "";
        return str1.substring(0, gcd(str1.length(), str2.length()));
    }

    static int gcd(int a, int b) {
        while (b != 0) { int t = b; b = a % b; a = t; }
        return a;
    }

    void main() {
        System.out.println(gcdOfStrings("ABCABC", "ABC"));    // ABC
        System.out.println(gcdOfStrings("ABABAB", "ABAB"));   // AB
        System.out.println(gcdOfStrings("LEET", "CODE"));     // ""
    }
}
