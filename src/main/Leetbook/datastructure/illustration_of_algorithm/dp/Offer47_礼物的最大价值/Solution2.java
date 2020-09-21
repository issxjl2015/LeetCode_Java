package Leetbook.datastructure.illustration_of_algorithm.dp.Offer47_礼物的最大价值;

public class Solution2 {
    public int maxValue(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int[] dp = new int[col];
        for (int i = 0; i < row; i++) {
            dp[0] += grid[i][0];
            for (int j = 1; j < col; j++) {
                dp[j] = Math.max(dp[j - 1], dp[j]) + grid[i][j];
            }
        }
        return dp[col - 1];
    }
}
