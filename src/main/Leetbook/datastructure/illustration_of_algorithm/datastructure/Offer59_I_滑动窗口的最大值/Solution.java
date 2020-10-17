package Leetbook.datastructure.illustration_of_algorithm.datastructure.Offer59_I_滑动窗口的最大值;

import java.util.Arrays;

public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return new int[] {};
        }
        int l = 0, r = 0, n = 0;
        int[] ans = new int[nums.length - k + 1];
        while (r < k - 1) {
            r++;
        }
        for (; l < nums.length - k; l++, r++) {
            int tmp = nums[l];
            for (int ll = l; ll <= r; ll++) {
                if (nums[ll] > tmp) {
                    tmp = nums[ll];
                }
            }
            ans[n++] = tmp;
        }

        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3,2,4};
        int k = 4;
        int[] ans = solution.maxSlidingWindow(nums, k);
        System.out.println(ans);
    }
}
