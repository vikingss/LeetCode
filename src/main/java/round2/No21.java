package round2;

import round1.firstLevel21.ListNode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 16:41 2018/10/8
 * @Modified By:
 */
public class No21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode tmp = dummy;
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        ListNode p = l1,q = l2;
        while(p != null && q != null){
            if(p.val <= q.val) {
                tmp.next = p;
                p = p.next;
            }else {
                tmp.next = q;
                q = q.next;
            }
            tmp = tmp.next;
        }
        while(p != null){
            tmp.next = p;
            p = p.next;
            tmp = tmp.next;
        }
        while(q != null){
            tmp.next = q;
            q = q.next;
            tmp = tmp.next;
        }
        return dummy.next;

    }
}
