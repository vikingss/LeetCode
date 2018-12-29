package round1;

import round1.firstLevel21.ListNode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 12:49 2018/7/4
 * @Modified By:
 */
public class firstLevel79 {

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur = head;
        while (cur != null) {
            ListNode q = cur.next;
            if (q != null && q.val == cur.val) {
                while (q != null && q.val == cur.val) {
                    q = q.next;
                }
                pre.next = q;
                cur = q;
            } else {
                pre = cur;
                cur = q;
            }

        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode p1 = new ListNode(2);
        ListNode q1 = new ListNode(3);
        ListNode p2 = new ListNode(3);
        ListNode q2 = new ListNode(4);
        ListNode q3 = new ListNode(4);
        ListNode q4 = new ListNode(5);
        head.next = p1;
        p1.next = q1;
        q1.next = p2;
        p2.next = q2;
        q2.next = q3;
        q3.next = q4;

        System.out.println(deleteDuplicates(head));
    }
}
