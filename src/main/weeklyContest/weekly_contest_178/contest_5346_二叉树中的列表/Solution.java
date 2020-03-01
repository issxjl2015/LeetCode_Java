package main.weeklyContest.weekly_contest_178.contest_5346_二叉树中的列表;

public class Solution {
    public boolean isSubPath(ListNode head, TreeNode root) {
        if (head == null) {
            return true;
        }
        if (root == null) {
            return false;
        }
        // 先判断当前节点，如果不对，再去判断左子树和右子树
        return isSub(head, root) || isSubPath(head, root.left) || isSubPath(head, root.right);
    }

    private boolean isSub(ListNode head, TreeNode node) {
        // 链表结束了
        if (head == null) {
            return true;
        }
        // 链表没结束，树结束了
        if (node == null) {
            return false;
        }
        // 如果值不同，必定不是
        if (head.val != node.val) {
            return false;
        }
        return isSub(head.next, node.left) || isSub(head.next, node.right);
    }
}
