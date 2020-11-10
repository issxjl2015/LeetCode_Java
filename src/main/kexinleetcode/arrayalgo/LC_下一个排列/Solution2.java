package kexinleetcode.arrayalgo.LC_下一个排列;

import java.util.Arrays;

public class Solution2 {
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        for (int i = len - 1; i >= 0; i--) {
            if (i == 0) {
                Arrays.sort(nums);
                return;
            } else {
                if (nums[i] > nums[i - 1]) {
                    // 对 下标 i 到下标 len - 1 的数 排序
                    Arrays.sort(nums, i, len);
                    for (int j = i; j < len; j++) {
                        if (nums[j] > nums[i - 1]) {
                            swap(nums, i - 1, j);
                            return;
                        }
                    }
                }
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
