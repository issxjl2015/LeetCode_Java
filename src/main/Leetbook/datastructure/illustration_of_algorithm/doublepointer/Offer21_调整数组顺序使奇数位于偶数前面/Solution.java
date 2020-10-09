package Leetbook.datastructure.illustration_of_algorithm.doublepointer.Offer21_调整数组顺序使奇数位于偶数前面;

public class Solution {
    public int[] exchange(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            while (l <= nums.length - 1 && nums[l] % 2 == 1) {
                l++;
            }
            while (r >= 0 && nums[r] % 2 == 0) {
                r--;
            }
            swap(nums, l, r);
        }
        return nums;
    }

    private void swap(int[] nums, int i, int j) {
        if (i >= j) {
            return;
        }
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 3, 5};
        int[] ans = solution.exchange(nums);
        System.out.println(ans);
    }
}
