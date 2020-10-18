package Leetbook.algorithm.sumofalgointerview.beforestart.LC_合并两个有序数组;

import java.util.Arrays;

/**
 * 题目：合并两个有序数组
 * 思路：
 *      1、直接在nums1的下标m开始添加nums2的元素
 *      2、对nums1数组进行排序
 */
public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m, j = 0; i < m + n && j < n; i++, j++) {
            nums1[i] = nums2[j];
        }
        Arrays.sort(nums1);
    }
}
