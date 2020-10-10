package Leetbook.datastructure.illustration_of_algorithm.doublepointer.Offer57_和为s的两个数字;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int l = 0, r = len - 1;
        while (l < r) {
            int sum = nums[l] + nums[r];
            if (sum == target) {
                return new int[] {nums[l], nums[r]};
            } else if (sum > target) {
                r--;
            } else {
                l++;
            }
        }
        return new int[] {};
    }
}
