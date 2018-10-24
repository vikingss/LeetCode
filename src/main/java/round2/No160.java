package round2;

import com.viki.leetcode.firstLevel21.ListNode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 15:10 2018/10/23
 * @Modified By:
 */
public class No160 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
            return null;
        ListNode p = headA, q = headB;
        while (p != q) {
            if (p == null)
                p = headB;
            else
                p = p.next;
            if (q == null)
                q = headA;
            else
                q = q.next;
        }
        return p;

    }
}
