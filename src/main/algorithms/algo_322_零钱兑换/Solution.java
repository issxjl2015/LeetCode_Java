package main.algorithms.algo_322_零钱兑换;

import java.util.Arrays;

public class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        if (amount == 0) return 0;
        Arrays.fill(dp, Integer.MAX_VALUE);
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= amount) {
                dp[coins[i]] = 1;
            }
        }
        for (int i = 1; i <= amount; i++) {
            if (dp[i] < Integer.MAX_VALUE) {
                for (int j = 0; j < coins.length; j++) {
                    if ((long) i + coins[j] <= amount) {
                        dp[i + coins[j]] = Math.min(dp[i] + 1, dp[i + coins[j]]);
                    }
                }
            }
        }
        if (dp[amount] == Integer.MAX_VALUE) {
            return -1;
        }
        return dp[amount];
    }
}
