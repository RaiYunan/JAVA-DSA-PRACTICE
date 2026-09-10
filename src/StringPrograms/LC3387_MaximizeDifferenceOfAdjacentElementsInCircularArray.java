package StringPrograms;

public class LC3387_MaximizeDifferenceOfAdjacentElementsInCircularArray {

    // O(n) time | O(1) space
    static int maxDifference(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) freq[c - 'a']++;
        int maxOdd = 0, minEven = Integer.MAX_VALUE;
        for (int f : freq) {
            if (f == 0) continue;
            if (f % 2 == 1) maxOdd  = Math.max(maxOdd,  f);
            else             minEven = Math.min(minEven, f);
        }
        return maxOdd - minEven;
    }

    void main() {
        System.out.println(maxDifference("aaaaabbc")); // 3
        System.out.println(maxDifference("abcabcab")); // 1
    }
}
