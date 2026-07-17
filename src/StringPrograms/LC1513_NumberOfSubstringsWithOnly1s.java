package StringPrograms;

public class LC1513_NumberOfSubstringsWithOnly1s {

    /*
     * count substrings containing only '1's
     * 1. track current streak of consecutive 1s
     * 2. each new '1' adds (streak) new substrings ending at current index
     * 3. reset streak on '0', apply mod to avoid overflow
     *
     * sliding window / math counting
     * O(n) time, O(1) space
     */
    static int numSub(String s) {
        long ans = 0, curr = 0, mod = 1_000_000_007;
        for (char c : s.toCharArray()) {
            if (c == '1') { curr++; ans = (ans + curr) % mod; }
            else            curr = 0;
        }
        return (int) ans;
    }

    void main() {
        System.out.println(numSub("0110111")); // 9
        System.out.println(numSub("101"));     // 2
        System.out.println(numSub("111111"));  // 21
    }
}
