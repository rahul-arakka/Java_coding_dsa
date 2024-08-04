


package code.SlidingWindow;

public BuyAndSellStocks{

class Solution {
    public int maxProfit(int[] prices) {
        int maxSum = 0, n = prices.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (prices[j] - prices[i] > maxSum) {
                    maxSum = prices[j] - prices[i];
                }
            }
        }
        if (maxSum > 0) return maxSum;
        return 0;
    }
}
        }