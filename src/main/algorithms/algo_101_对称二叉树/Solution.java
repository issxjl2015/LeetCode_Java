package main.algorithms.algo_101_对称二叉树;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode n1, TreeNode n2) {
        if (n1 == null || n2 == null) {
            return n1 == n2;
        }
        if (n1.val != n2.val) {
            return false;
        }
        return isSymmetric(n1.left, n2.right) && isSymmetric(n1.right, n2.left);
    }
}
