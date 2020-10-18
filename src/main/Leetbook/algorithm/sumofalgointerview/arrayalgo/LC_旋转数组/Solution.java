package Leetbook.algorithm.sumofalgointerview.arrayalgo.LC_旋转数组;

public class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        int kk = k % len;
        for (int i = 0; i < kk; i++) {
            rotateNums(nums);
        }
    }

    private void rotateNums(int[] nums) {
        int tmp = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            nums[i + 1] = nums[i];
        }
        nums[0] = tmp;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        solution.rotate(nums, k);
        System.out.println(nums);
    }

}
