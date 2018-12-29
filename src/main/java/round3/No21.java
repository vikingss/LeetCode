package round3;

import round1.firstLevel21.ListNode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 23:37 2018/10/28
 * @Modified By:
 */
public class No21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode pre = dummy;
        ListNode p = l1,q = l2;
        while(p != null && q != null){
            if(p.val > q.val) {
                pre.next = q;
                q = q.next;
                pre = pre.next;
            }else if(p.val <= q.val){
                pre.next = p;
                p = p.next;
                pre = pre.next;
            }
        }
        while(p != null) {
            pre.next = p;
            p = p.next;
            pre = pre.next;
        }
        while(q != null){
            pre.next = q;
            q = q.next;
            pre = pre.next;
        }
        return dummy.next;
    }
}
