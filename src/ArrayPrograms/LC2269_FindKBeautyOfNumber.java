package ArrayPrograms;


public class LC2269_FindKBeautyOfNumber {

    /*
     * count k-length substrings of num that evenly divide num
     * 1. convert num to string, slide window of size k
     * 2. parse each substring as int
     * 3. skip zeros, increment count if num % val == 0
     *
     * sliding window on string
     * O(n) time, O(n) space
     */
    static int divisorSubstrings(int num, int k) {
        String s = String.valueOf(num);
        int count = 0;
        for (int i = 0; i <= s.length() - k; i++) {
            int val = Integer.parseInt(s.substring(i, i + k));
            if (val != 0 && num % val == 0) count++;
        }
        return count;
    }

    void main() {
        System.out.println(divisorSubstrings(240, 2)); // 2
        System.out.println(divisorSubstrings(430, 2)); // 2
        System.out.println(divisorSubstrings(999, 1)); // 3
    }
}
