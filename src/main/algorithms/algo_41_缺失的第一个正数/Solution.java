package main.algorithms.algo_41_缺失的第一个正数;

import java.util.Arrays;

/**
 * 0, 1, 2 = 3      0, 1, 2 = 3
 * -1, 1, 3, 4 = 8  -1, 1, 2, 3 = 6
 * -1, 2, 3, 4 = 9  -1, 1, 2, 3, 4 = 10
 */
public class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int ans = nums[0];

        // sum1 表示原始数组中所有正数的和
        int sum1 = 0;
        // sum2 表示新数组中所有正数的和
        int sum2 = 0;
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 0) {
                flag = true;
                continue;
            }
            sum1 += nums[i];
        }
        if (flag) {
            // 说明存在负数或者0，需要从1开始累加
            for (int i = 1; i <= nums[len - 1]; i++) {
                sum2 += i;
            }
        } else {
            for (int i = nums[0]; i <= nums[len - 1]; i++) {
                sum2 += i;
            }
        }
        int abs = Math.abs(sum2 - sum1);
        return abs == 0 ? nums[len - 1] + 1 : abs;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3, 4, -1, 1};
        int ans = solution.firstMissingPositive(nums);
        System.out.println(ans);
    }
}
