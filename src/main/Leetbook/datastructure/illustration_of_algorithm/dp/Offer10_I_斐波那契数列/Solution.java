package Leetbook.datastructure.illustration_of_algorithm.dp.Offer10_I_斐波那契数列;

public class Solution {
    public int fib(int n) {
        int[] dp = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                dp[0] = 0;
                continue;
            }
            if (i == 1) {
                dp[1] = 1;
                continue;
            }
            // 考虑大数，要取模1000000007
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000007;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.fib(48));
    }
}
