package src.main.algorithms.algo_560_和为K的子数组;

public class Solution {
    public int subarraySum(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = 0;
            for (int j = i; j < nums.length; j++) {
                temp += nums[j];
                if (temp == k) {
                    num++;
                }
            }
        }
        return num;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {-1, -1, 1};
        int k = 0;
        int res = solution.subarraySum(nums, k);
        System.out.println(res);
    }
}
