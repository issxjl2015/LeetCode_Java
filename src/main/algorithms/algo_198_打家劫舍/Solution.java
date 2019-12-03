package main.algorithms.algo_198_打家劫舍;

/**
 dp[0] = 0 -> 表示还没开始，自然打家劫舍的钱为0
 dp[1] = 3 -> 表示打劫第一家，钱自然为 nums[1]
 再后续，就是dp[n + 2] = Math.max(dp[i] + nums[i], dp[i + 1])
 */
public class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length + 2];
        for (int i = 0; i < nums.length; i++) {
            dp[i + 2] = Math.max(dp[i] + nums[i], dp[i + 1]);
        }
        return dp[nums.length + 1];
    }
}
