package Leetbook.algorithm.sumofalgointerview.arrayalgo.LC_移动零;

public class Solution {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        // 返回去除 0 之后的数组长度
        int p = removeElement(nums, 0);
        // 将 p 之后的所有元素赋值为 0
        for (; p < nums.length; p++) {
            nums[p] = 0;
        }
    }

    // r 遇到需要去除的元素，则直接跳过；
    // 否则就告诉 l，将 r下标的值赋值给 l下标，并 l++
    // 最后返回的其实是数组的长度
    private int removeElement(int[] nums, int val) {
        int l = 0, r = 0;
        while (r < nums.length) {
            if (nums[r] != val) {
                nums[l++] = nums[r];
            }
            r++;
        }
        return l;
    }

}
