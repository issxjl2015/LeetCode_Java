package main.algorithms.algo_24_两两交换链表中的节点;

public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode head = new ListNode(1);//创建头节点
        head.next = new ListNode(2);//再定义头节点的next域
        ListNode t = head.next;
        for(int i=3;i<10;i++) {//创建一个简单的链表{1,2,3,4,5,...,9}
            t.next = new ListNode(i);
            t = t.next;
        }
        ListNode lst = solution.swapPairs(head);
        while (lst.next != null) {
            System.out.println(lst.val);
            lst = lst.next;
        }
    }
}
