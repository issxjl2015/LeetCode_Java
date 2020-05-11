package src.main.algorithms.algo_209_长度最小的子数组;

/**
 * 核心思想：滑动窗口
 * 1、累加窗口内的值 sum
 * 2、如果窗口内的值 大于 s， 那么计算len, 且 左窗口 右移，并更新sum的值
 */

public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        int sum = 0;
        int len = 0;
        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];
            while (sum >= s) {
                // 获取最小的长度
                len = len == 0 ? j - i + 1 : Math.min(len, j - i + 1);
                // 左指针右移
                sum -= nums[i++];
            }
        }
        return len;
    }
}
