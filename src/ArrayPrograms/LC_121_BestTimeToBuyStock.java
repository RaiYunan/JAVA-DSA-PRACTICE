package ArrayPrograms;

public class LC_121_BestTimeToBuyStock {

    // Single pass solution - O(n) time, O(1) space
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) return 0;

        int minPrice = Integer.MAX_VALUE; // Lowest buying price seen
        int maxProfit = 0; // Best profit achievable

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // Found better buying price
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice); // Update profit if selling now is better
            }
        }

        return maxProfit;
    }

    // Alternative concise version (same logic)
    public static int maxProfitAlt(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        // Test Case 1: Normal case with profit
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Test 1 - Prices: [7,1,5,3,6,4]");
        System.out.println("Expected: 5 (Buy at 1, Sell at 6)");
        System.out.println("Result: " + maxProfit(prices1));
        System.out.println("Alternative: " + maxProfitAlt(prices1));

        // Test Case 2: No profit possible
        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println("\nTest 2 - Prices: [7,6,4,3,1]");
        System.out.println("Expected: 0");
        System.out.println("Result: " + maxProfit(prices2));

        // Test Case 3: Single day
        int[] prices3 = {7};
        System.out.println("\nTest 3 - Single day: [7]");
        System.out.println("Expected: 0");
        System.out.println("Result: " + maxProfit(prices3));

        // Test Case 4: Empty array
        int[] prices4 = {};
        System.out.println("\nTest 4 - Empty array");
        System.out.println("Expected: 0");
        System.out.println("Result: " + maxProfit(prices4));

        // Test Case 5: Null array
        System.out.println("\nTest 5 - Null array");
        System.out.println("Expected: 0");
        System.out.println("Result: " + maxProfit(null));

        // Test Case 6: Profit at end
        int[] prices6 = {3, 2, 6, 5, 0, 3};
        System.out.println("\nTest 6 - Prices: [3,2,6,5,0,3]");
        System.out.println("Expected: 4 (Buy at 2, Sell at 6)");
        System.out.println("Result: " + maxProfit(prices6));

        // Test Case 7: All same prices
        int[] prices7 = {5, 5, 5, 5};
        System.out.println("\nTest 7 - Constant prices: [5,5,5,5]");
        System.out.println("Expected: 0");
        System.out.println("Result: " + maxProfit(prices7));
    }
}