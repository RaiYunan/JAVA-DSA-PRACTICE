package ArrayPrograms;

public class LC_121_BestTimeToBuyStock {
    public static int maxProfit(int[] prices) {
        // Edge case: empty or single day (no transaction possible)
        if (prices == null || prices.length <= 1) {
            return 0;
        }

        int minPrice = Integer.MAX_VALUE; // Track lowest price seen so far
        int maxProfit = 0; // Track maximum profit possible

        for (int price : prices) {
            // Update minimum price if current price is lower
            if (price < minPrice) {
                minPrice = price;
            }
            // Calculate profit if selling at current price
            else {
                int currentProfit = price - minPrice;
                // Update max profit if current profit is higher
                if (currentProfit > maxProfit) {
                    maxProfit = currentProfit;
                }
            }
        }

        return maxProfit;
    }
}
