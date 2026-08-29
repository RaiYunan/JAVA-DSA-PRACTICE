package StringPrograms;

public class LC3330_FindTheOriginalTypedStringI {

    // linear scan ...O(n) time, O(1) space
    static int possibleStringCount(String word) {
        int count = 1;
        for (int i = 1; i < word.length(); i++)
            if (word.charAt(i) == word.charAt(i - 1)) count++;
        return count;
    }

    void main() {
        System.out.println(possibleStringCount("abbcccc")); // 5
        System.out.println(possibleStringCount("abcd"));    // 1
        System.out.println(possibleStringCount("aaaa"));    // 4
    }
}
