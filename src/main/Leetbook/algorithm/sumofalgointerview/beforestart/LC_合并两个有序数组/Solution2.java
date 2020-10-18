package Leetbook.algorithm.sumofalgointerview.beforestart.LC_合并两个有序数组;

/**
 * 题目：合并两个有序数组
 * 思路：1、从nums1何nums2的尾部开始比较，大的值优先放置nums1的最后
 */
public class Solution2 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = m + n - 1;
        int i = m - 1, j = n - 1;
        while ( i >= 0 || j >= 0) {
            if (i < 0) {
                nums1[index--] = nums2[j--];
            } else if (j < 0) {
                nums1[index--] = nums1[i--];
            } else {
                if (nums1[i] > nums2[j]) {
                    nums1[index--] = nums1[i--];
                } else {
                    nums1[index--] = nums2[j--];
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        solution.merge(nums1, m, nums2, n);
        System.out.println(nums1);
    }
}
