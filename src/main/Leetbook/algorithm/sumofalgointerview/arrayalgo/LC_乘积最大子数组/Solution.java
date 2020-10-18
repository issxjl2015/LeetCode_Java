package Leetbook.algorithm.sumofalgointerview.arrayalgo.LC_乘积最大子数组;

public class Solution {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length < 1) {
            return -1;
        }
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int tmp = 1;
            for (int j = i; j < nums.length; j++) {
                tmp *= nums[j];
                ans = Math.max(tmp, ans);
            }
        }
        return ans;
    }
}
