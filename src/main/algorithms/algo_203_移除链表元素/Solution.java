package main.algorithms.algo_203_移除链表元素;

public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        // 定义一个哑结点
        ListNode dumb = new ListNode(0);
        // 定义一个节点赋值为哑结点
        dumb.next = head;
        // 定义一个遍历节点
        ListNode iter = dumb;
        while (iter.next != null) {
            ListNode curr = iter.next;
            if (curr.val == val) {
                iter.next = curr.next;
                continue;
            }
            // 如果不相等，迭代节点向后移动一个
            iter = iter.next;
        }
        return dumb.next;
    }
}
