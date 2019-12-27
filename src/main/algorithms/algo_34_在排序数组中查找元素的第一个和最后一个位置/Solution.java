package main.algorithms.algo_34_在排序数组中查找元素的第一个和最后一个位置;

public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int index = 0;
        int[] result = new int[2];
        for (int i = 0;i< nums.length; i++) {
            if (index == 0 && nums[i] == target) {
                result[0] = i;
                index++;
            }
            if (index != 0 && nums[i] == target) {
                result[1] = i;
                index++;
            }
        }
        if (index == 1) {
            return new int[] {result[0], result[0]};
        }
        if (index > 1) {
            return result;
        }
        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        Solution solution = new Solution();
        int[] ans = solution.searchRange(nums, target);
        System.out.println(ans[0]);
        System.out.println(ans[1]);
    }
}
