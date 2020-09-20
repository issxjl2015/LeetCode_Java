package Leetbook.datastructure.illustration_of_algorithm.datastructure.Offer06_从尾到头打印链表;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    List<Integer> list = new ArrayList<>();

    public int[] reversePrint(ListNode head) {
        recur(head);
        int[] res = new int[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    private void recur(ListNode head) {
        if (head == null) return;
        recur(head.next);
        list.add(head.val);
    }
}
