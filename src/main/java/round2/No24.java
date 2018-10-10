package round2;

import com.viki.leetcode.firstLevel21.ListNode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 09:30 2018/10/9
 * @Modified By:
 */
public class No24 {
    public ListNode swapPairs(ListNode head) {
        if(head == null) return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode p = head;
        ListNode pre = dummy;
        while(p != null && p.next  != null){
            pre.next = p.next;
            p.next = p.next.next;
            pre.next.next = p;
            pre = p;
            p = p.next;
        }
        return dummy.next;
    }
}
