package main.algorithms.algo_104_二叉树的最大深度;

public class Solution {
    int result = 0;
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        result = Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
        return result;
    }
}
