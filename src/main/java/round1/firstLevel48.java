package round1;

import round1.firstLevel21.ListNode;

/**
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 *
 * 示例 1:
 *
 * 输入: 1->1->2 输出: 1->2 示例 2:
 *
 * 输入: 1->1->2->3->3 输出: 1->2->3
 */
public class firstLevel48 {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode pre = head;
        ListNode p = head;
        int curVal = p.val;
        while (p != null) {
            if (p.val != curVal) {
                //删除步数内的节点
                pre.next = p;
                pre = p;
                curVal = p.val;
            }
            if(p.next == null && pre != p){
                pre.next = null;
            }
            p = p.next;

        }
        return head;
    }
}
