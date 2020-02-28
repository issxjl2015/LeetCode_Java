package main.剑指offer.algo_18_删除链表的节点;

public class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode first = new ListNode(-1);
        first.next = head;
        ListNode curNode = first;
        while (curNode.next != null && curNode.next.val != val){
            curNode = curNode.next;
        }

        if (curNode.next != null){
            ListNode next = curNode.next;
            curNode.next = next.next;
            next.next = null; // help gc
        }

        return first.next;
    }
}
