package main.algorithms.algo_102_二叉树的遍历;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    List<List<Integer>> levels = new ArrayList<List<Integer>>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return levels;
        }
        helper(root, 0);
        return levels;
    }

    private void helper(TreeNode root, int level) {
        // start the current level
        if (levels.size() == level) {
            levels.add(new ArrayList<Integer>());
        }
        // fulfil the current level
        levels.get(level).add(root.val);

        // process child nodes for the next level
        if (root.left != null) {
            helper(root.left, level + 1);
        }
        if (root.right != null) {
            helper(root.right, level + 1);
        }
    }
}
