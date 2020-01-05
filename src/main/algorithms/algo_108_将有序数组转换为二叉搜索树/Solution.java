package main.algorithms.algo_108_将有序数组转换为二叉搜索树;

public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return help(nums, 0, nums.length);
    }

    private  TreeNode help(int[] nums, int start, int end) {
        if (start == end) {
            return null;
        }
        int mid = start + (end - start) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = help(nums, start, mid);
        root.right = help(nums, mid + 1, end);
        return root;
    }
}
