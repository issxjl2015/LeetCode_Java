package src.main.algorithms.algo_325_和等于k的最长子数组长度;

import java.util.HashMap;

public class Solution {
    public int maxSubArrayLen(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int n = nums.length;
        // 前缀和 和 下标
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int curSum = 0, res = 0;
        for (int i = 0; i < n; i++) {
            curSum += nums[i];
            // 若map中存在 curSum - k，那么数组下标 i 到 idx + 1 之间肯定存在和为 k 的子集
            if (map.containsKey(curSum - k)) {
                // curSum 的值 超过了 k，那么起点肯定不是从 0 开始了
                // 那么curSum的下标是 i, curSum - k 的下标是 map.get(curSum - k)
                // 那么从下标 map.get(curSum - k) 到 下标 i 之间的和 肯定是 k
                // 这就是核心
                int idx = map.get(curSum - k);
                res = Math.max(res, i - idx);
            }
            // 如果存在多个前缀和一样，就保留较小的，越小越好
            if (!map.containsKey(curSum)) {
                map.put(curSum, i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {-2, -1, 2, 1};
        int k = 1;
        int res = solution.maxSubArrayLen(nums, k);
        System.out.println(res);
    }
}
