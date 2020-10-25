package algorithms.algo_322_零钱兑换;

import java.util.Arrays;

public class Solution2 {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        // 对数组进行赋值
        Arrays.fill(dp, amount + 1);
        // 当 amount = 0 时，没有硬币
        dp[0] = 0;
        // 对 数组 进行 遍历
        for (int i = 0; i < dp.length; i++) {
            // 对 硬币 进行 遍历
            for (int coin : coins) {
                // 表示当前的硬币太大，超出了目标金额，无解
                if (i - coin < 0) {
                    continue;
                }
                // 当前硬币放入，1 + dp[i - coins[i]]
                // 当前硬币不放入，dp[i]
                dp[i] = Math.min(dp[i], 1 + dp[i - coins[i]]);
            }
        }
        return dp[amount];
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        int[] coins = {1, 2, 5};
        int amount = 11;
        int ans = solution2.coinChange(coins, amount);
        System.out.println(ans);
    }
}
