package round2;

import round1.firstLevel21.ListNode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 16:09 2018/10/16
 * @Modified By:
 */
public class No92 {

    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null) {
            return null;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        for (int i = 0; i < m - 1; ++i) {
            pre = pre.next;
        }
        ListNode p = pre.next;
        for (int i = 0; i < n - m; ++i) {
            ListNode q = p.next;
            p.next = q.next;
            q.next = pre.next;
            pre.next = q;
        }
        return dummy.next;
    }
}
