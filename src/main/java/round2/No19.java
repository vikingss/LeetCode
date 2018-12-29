package round2;

import round1.firstLevel21.ListNode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 15:35 2018/10/8
 * @Modified By:
 */
public class No19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(-1);
        ListNode slow = dummy, fast = dummy;
        dummy.next = head;
        for (int i = 1; i <= n + 1; ++i) {
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}
