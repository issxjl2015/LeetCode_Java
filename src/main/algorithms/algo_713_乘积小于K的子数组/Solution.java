package src.main.algorithms.algo_713_乘积小于K的子数组;

/**
 * 对于超长的nums数组，会存在超时的情况
 */
public class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (nums == null || nums.length < 1) {
            return 0;
        }
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = 1;
            for (int j = i; j < nums.length; j++) {
                temp *= nums[j];
                if (temp < k) {
                    res++;
                } else {
                    break;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        int k = 9;
        int ans = solution.numSubarrayProductLessThanK(nums, k);
        System.out.println(ans);
    }
}
