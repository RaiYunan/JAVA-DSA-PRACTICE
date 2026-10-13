package DynamicProgramming;

public class LC746_MinCostClimbingStairs {

    //  O(n) time | O(n) space
    static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n + 1];
        for (int i = 2; i <= n; i++)
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        return dp[n];
    }

    void main() {
        System.out.println(minCostClimbingStairs(new int[]{10, 15, 20}));          // 15
        System.out.println(minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1})); // 6
    }
}
