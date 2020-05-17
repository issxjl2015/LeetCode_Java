package src.main.algorithms.algo_713_乘积小于K的子数组;

public class SolutionTwo {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (nums == null || nums.length < 1) {
            return 0;
        }
        int l = 0;
        int prod = 1; // 存储 nums[l] 到 nums[r] 的累积
        int res = 0;
        for (int r = 0; r < nums.length; r++) {
            prod *= nums[r];
            while (prod >= k) {
                prod /= nums[l++];
            }
            // 计算符合条件的子串数量
            res += r - l + 1;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3};
        int k = 1;
        int res = solution.numSubarrayProductLessThanK(nums, k);
        System.out.println(res);
    }
}
