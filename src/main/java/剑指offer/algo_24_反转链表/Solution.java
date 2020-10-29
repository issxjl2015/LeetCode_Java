package 剑指offer.algo_24_反转链表;

public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        // 1、先翻转 head 之后的链表
        ListNode newHead = reverseList(head.next);

        // 2、再把 原 head 节点后继结点的后继结点指向 head(4), head 的后继结点设置为 null(防止形成环)
        head.next.next = head;
        head.next = null;

        // 3、返回翻转后的头结点
        return newHead;
    }
}
