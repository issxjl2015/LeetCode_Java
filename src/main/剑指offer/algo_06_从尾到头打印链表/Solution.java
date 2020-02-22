package main.剑指offer.algo_06_从尾到头打印链表;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] reversePrint(ListNode head) {
        ListNode node = head;

        List<Integer> lst = new ArrayList<>();
        while (head != null) {
            lst.add(head.val);
            head = head.next;
        }
        int len = lst.size();
        int[] ans = new int[len];
        for (int i = 0; i < len; i++) {
            ans[len - i - 1] = lst.get(i);
        }
        return ans;
    }
}
