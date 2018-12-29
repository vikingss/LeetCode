package round4;

import round1.firstLevel21.ListNode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 19:14 2018/12/26
 * @Modified By:
 */
public class AddTwoNumber {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        int curry = 0;
        ListNode p = l1;
        ListNode q = l2;
        ListNode dummy = new ListNode(-1);
        ListNode pre = dummy;
        while(p != null || q != null){
            int val = (p == null ? 0 : p.val) + (q == null ? 0 : q.val) + curry;
            curry = val / 10;
            val %= 10;
            ListNode node = new ListNode(val);
            pre.next = node;
            pre = pre.next;
            if(p != null) p = p.next;
            if(q != null) q = q.next;
        }
        if(curry != 0){
            ListNode node = new ListNode(curry);
            pre.next = node;
            pre = pre.next;
        }
        return dummy.next;
    }
}
