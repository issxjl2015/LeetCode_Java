package algorithms.algo_121_买卖股票的最佳时机;

public class Solution2 {
    public int maxProfit(int[] prices) {
        if (prices == null && prices.length <= 1) {
            return 0;
        }
        int[][] dp = new int[prices.length][2];
        for (int i = 0; i < prices.length; i++) {
            // 处理 base case
            if (i - 1 < 0) {
                // dp[i][0] = max(dp[-1][0], dp[-1][1] + prices[i])
                //          = max(0, -infinity + prices[i]) = 0
                dp[i][0] = 0;
                // dp[i][1] = max(dp[-1][1], dp[-1][0] - prices[i])
                //          = max(-infinity, 0 - prices[i])
                //          = -prices[i]
                dp[i][1] = -prices[i];
                continue;
            }
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], -prices[i]);
        }
        return dp[prices.length - 1][0];
    }
}
