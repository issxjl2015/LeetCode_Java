package Leetbook.datastructure.illustration_of_algorithm.datastructure.Offer06_从尾到头打印链表;

import java.util.LinkedList;

/**
 * 利用栈的思想
 */
public class Solution2 {

    public int[] reversePrint(ListNode head) {
        LinkedList<Integer> stack = new LinkedList<>();
        while (head != null) {
            stack.addLast(head.val);
            head = head.next;
        }
        int[] res = new int[stack.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = stack.removeLast();
        }
        return res;
    }
}
