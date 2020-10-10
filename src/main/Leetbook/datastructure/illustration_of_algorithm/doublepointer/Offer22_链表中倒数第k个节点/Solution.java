package Leetbook.datastructure.illustration_of_algorithm.doublepointer.Offer22_链表中倒数第k个节点;

public class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode pre = head;
        ListNode cur = head;
        int cnt = 0;
        while (cur != null) {
            cur = cur.next;
            cnt++;
            if (cnt == k) {
                break;
            }
        }

        while (cur != null) {
            cur = cur.next;
            pre = pre.next;
        }
        return pre.next;
    }
}
