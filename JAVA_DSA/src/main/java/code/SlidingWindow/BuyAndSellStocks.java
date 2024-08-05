//https://30dayscoding.com/dsa
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
//You are given an array prices where prices[i] is the price of a given stock on the ith day.
//You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

package code.SlidingWindow;

public BuyAndSellStocks{

class Solution {
    public int maxProfit(int[] prices) {
//        int maxSum = 0, n = prices.length;
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (prices[j] - prices[i] > maxSum) {
//                    maxSum = prices[j] - prices[i];
//                }
//            }
//        }
//        if (maxSum > 0) return maxSum;
//        return 0;

        int small = prices[0], sIndex = 0;
        for (int i = 0; i < n - 1; i++) {
            if (prices[i] < small) {
                sIndex = i;
                small = prices[i];
            }
        }
        int max = 0;
        for (int j = sIndex + 1; j < n; j++) {
            if (prices[j] - small > max) {
                max = prices[j] - small;
            }
        }
        return max;

    }
}
        }