package Leetbook.datastructure.illustration_of_algorithm.dp.Offer42_连续子数组的最大和;

public class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            dp[i] = Integer.MIN_VALUE;
        }

        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                dp[i] = nums[i];
            } else {
                dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
            }
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
//        int[] arr = {1};
        int ans = solution.maxSubArray(arr);
        System.out.println("===============");
        System.out.println(ans);
    }
}
