package main.contest.weekly_contest_176.contest_5340_统计有序矩阵中的负数;

public class Solution {
    public int countNegatives(int[][] grid) {
        int ans = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] < 0) {
                    ans++;
                }
            }
        }
        return ans;
    }
}
