package main.algorithms.algo_516_最长回文子序列;

public class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[] [] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }

        for (int i = n - 1; i >= 0; i--) {
            for (int j = i + 1; j < n; j++) {
                // 状态转移方程
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
        // 整个s的最长回文子串长度
        return dp[0][n - 1];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.longestPalindromeSubseq("bbbab");
        System.out.println(ans);
    }
}
