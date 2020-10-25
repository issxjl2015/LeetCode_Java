package kexinleetcode.arrayalgo.LC_下一个排列;

import java.util.Arrays;

public class Solution {
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        // 从右开始寻找，是因为要找到下一个排列，肯定是后面的数进行重新排列，保持前面的数不动
        for (int i = len - 1; i >= 0; i--) {
            if (i == 0) {
                // 对于不存在下一个排列的情况，直接返回最小的排列
                // 不存在下一个排列的情况就是，当前就是最大排列
                Arrays.sort(nums);
                return;
            } else {
                // 寻找下降的点
                if (nums[i] > nums[i - 1]) {
                    // 对 i-1 后的数 进行从小到大的排列
                    Arrays.sort(nums, i, len);
                    for (int j = i; j < len; j++) {
                        // 当出现第一个大于nums[i - 1]的数时，交换元素
                        if (nums[j] > nums[i - 1]) {
                            swap(nums, j, i - 1);
                            return;
                        }
                    }
                }
            }
        }
    }

    private void swap(int[] nums, int l, int r) {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] nums = {1, 2, 3};
        int[] nums = {3, 2, 1};
        solution.nextPermutation(nums);
        System.out.println(nums);
    }
}
