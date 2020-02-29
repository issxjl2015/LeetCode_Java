package main.剑指offer.algo_22_链表中倒数第k个节点;

public class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        ListNode node = new ListNode(-1);
        node.next = head;
        ListNode fast = node;
        ListNode slow = node;
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
