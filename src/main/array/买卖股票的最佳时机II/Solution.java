package src.main.array.买卖股票的最佳时机II;

class Solution {
    public int maxProfit(int[] prices) {
        int i = 0;
        int valley = prices[0]; // 谷底
        int peak = prices[0];   // 山峰
        int maxprofit = 0;
        while (i < prices.length - 1) {
            while (i < prices.length - 1 && prices[i] >= prices[i + 1])
                i++;
            valley = prices[i];
            while (i < prices.length - 1 && prices[i] <= prices[i + 1])
                i++;
            peak = prices[i];
            maxprofit += peak - valley;
        }
        return maxprofit;
    }
}