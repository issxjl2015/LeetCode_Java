package main.algorithms.algo_300_最长上升子序列;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int maxans = 1;
        for (int i = 1; i < dp.length; i++) {
            int maxval = 0;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    maxval = Math.max(maxval, dp[j]);
                }
            }
            dp[i] = maxval + 1;
            maxans = Math.max(maxans, dp[i]);
        }
        return maxans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {10, 9, 2, 5, 3, 7, 101, 18};
        int result = solution.lengthOfLIS(arr);
        System.out.println(result);
    }
}
