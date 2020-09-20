package Leetbook.datastructure.illustration_of_algorithm.dp.Offer10_II_青蛙跳台阶问题;

public class Solution {
    public int numWays(int n) {
        int[] dp = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                dp[i] = 1;
                continue;
            }
            if (i == 1) {
                dp[i] = 1;
                continue;
            }
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000007;
        }
        return dp[n];
    }
}
