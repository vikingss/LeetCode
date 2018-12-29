package round3;

import round1.firstLevel21.ListNode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 09:35 2018/10/29
 * @Modified By:
 */
public class No24 {

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode p = head;
        while (p != null && p.next !=  null) {
            ListNode tmp = p.next.next;
            p.next.next = pre.next;
            pre.next = p.next;
            p.next = tmp;
            pre = p;
            p = p.next;
        }
        return dummy.next;
    }
}
