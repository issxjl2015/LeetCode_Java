package src.main.algorithms.algo_209_长度最小的子数组;

/**
 * 核心思想：把所有可能的子数组求和并更新 ans, 直到找到最优子数组 且 和满足 sum >= s
 */
public class SolutionOne {
    public int minSubArrayLen(int s, int[] nums) {
        int ans = Integer.MAX_VALUE;
        // 变量 i 从左到右遍历数组
        for (int i  = 0; i < nums.length; i++) {
            // 变量 j 从当前元素到数组尾部遍历
            for (int j = i; j < nums.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += nums[k];
                }
                // 如果和sum 比 s 大
                if (sum >= s) {
                    // 更新 ans = min(ans, (j - i + 1))
                    ans = Math.min(ans, j - i + 1);
                    break;
                }
            }
        }
        return (ans != Integer.MAX_VALUE) ? ans : 0;
    }
}
