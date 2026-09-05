package StringPrograms;

public class LC2185_CountingWordsWithGivenPrefix {

    // O(n*m) time | O(1) space
    static int prefixCount(String[] words, String pref) {
        int count = 0;
        for (String word : words) if (word.startsWith(pref)) count++;
        return count;
    }

    void main() {
        System.out.println(prefixCount(new String[]{"pay", "attention", "practice", "attend"}, "at")); // 2
        System.out.println(prefixCount(new String[]{"leetcode", "win", "loops", "success"}, "code"));  // 0
    }
}
