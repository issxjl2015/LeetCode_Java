package src.main.algorithms.algo_523_连续的子数组和;

public class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        if (nums == null || nums.length < 1) {
            return false;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            int temp = 0;
            for (int j = i; j < nums.length; j++) {
                temp += nums[j];
                // 需要考虑一下：k = 0 的情况
                if (j - i >= 1 && (k == 0 ? temp == 0 : (temp % k == 0))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {0, 0};
        int k = 0;
        boolean flag = solution.checkSubarraySum(nums, k);
        System.out.println(flag);
    }
}
