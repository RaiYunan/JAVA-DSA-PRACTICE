package StringPrograms;

public class LC2937_MinimizeOperationsToMakeAllStringsEqual {

    // linear scan - find common prefix length, subtract from total | O(n) time | O(1) space
    static int findMinimumOperations(String s1, String s2, String s3) {
        int i = 0;
        while (i < s1.length() && i < s2.length() && i < s3.length() &&
                s1.charAt(i) == s2.charAt(i) && s2.charAt(i) == s3.charAt(i)) i++;
        if (i == 0) return -1;
        return s1.length() + s2.length() + s3.length() - 3 * i;
    }

    void main() {
        System.out.println(findMinimumOperations("abc", "abb", "ab"));  // 2
        System.out.println(findMinimumOperations("dac", "bac", "cac")); // -1
        System.out.println(findMinimumOperations("ab", "ab", "ab"));    // 0
    }
}