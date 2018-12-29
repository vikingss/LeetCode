package round3;

import round1.firstLevel21.ListNode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 17:05 2018/11/5
 * @Modified By:
 */
public class No160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p = headA,q = headB;
        while(p != q){
            p = p == null ? headB : p.next;
            q = q == null ? headA : q.next;
        }
        return p;
    }
}
