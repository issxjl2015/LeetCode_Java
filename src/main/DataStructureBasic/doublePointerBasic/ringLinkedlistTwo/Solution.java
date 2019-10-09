package src.main.DataStructureBasic.doublePointerBasic.ringLinkedlistTwo;

/**
 * 环形链表 II
 * 给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
 *
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
 *
 * 说明：不允许修改给定的链表。
 *
 *
 *
 * 示例 1：
 *
 * 输入：head = [3,2,0,-4], pos = 1
 * 输出：tail connects to node index 1
 * 解释：链表中有一个环，其尾部连接到第二个节点。
 *
 *
 * 示例 2：
 *
 * 输入：head = [1,2], pos = 0
 * 输出：tail connects to node index 0
 * 解释：链表中有一个环，其尾部连接到第一个节点。
 *
 *
 * 示例 3：
 *
 * 输入：head = [1], pos = -1
 * 输出：no cycle
 * 解释：链表中没有环。
 *
 *
 *
 *
 * 进阶：
 * 你是否可以不用额外空间解决此题？
 *
 *
 * 思路： 还是快慢指针，不过此处是使用了两次快慢指针来确定入环点
 * 思路：运用了两次快慢指针。第一次快慢指针是利用fast比slow的步伐更快，确定是否为环形链路；
 * 第二次快慢指针是利用头结点赋值给slow2和slow进行遍历，相等处即为相应的入环点
 *
 * 疑惑：为啥slow2和slow相遇的点就是入环点。
 *  参考博客：https://www.cnblogs.com/jiameng991010/p/11264456.html
 *  参考博客：https://blog.csdn.net/mucaoyx/article/details/81395782
 * */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                ListNode slow2 = head;
                while(slow2 != slow){
                    slow = slow.next;
                    slow2 = slow2.next;
                }
                return slow;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode = new ListNode(-21);
        solution.detectCycle(listNode);
    }
}
