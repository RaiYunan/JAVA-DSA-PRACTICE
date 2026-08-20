package ArrayPrograms;

public class LC2110_NumberOfSmoothDescentPeriodsOfStock {

    // O(n) time, O(1) space
    static long getDescentPeriods(int[] prices) {
        long ans = 1, length = 1;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] == prices[i - 1] - 1) length++;
            else                                 length = 1;
            ans += length;
        }
        return ans;
    }

    void main() {
        System.out.println(getDescentPeriods(new int[]{3, 2, 1, 4})); // 7
        System.out.println(getDescentPeriods(new int[]{8, 6, 7, 7})); // 4
        System.out.println(getDescentPeriods(new int[]{1}));           // 1
    }
}
