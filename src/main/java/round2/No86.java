package round2;

import round1.firstLevel21.ListNode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 14:41 2018/10/16
 * @Modified By:
 */
public class No86 {
    public ListNode partition(ListNode head, int x) {
        if(head == null) return null;
        ListNode low = new ListNode(0),high = new ListNode(0);
        ListNode p = head,l = low,h = high;
        while(p != null){
            if(p.val  < x) {
                l.next = p;
                l = l.next;
            }
            else {
                h.next = p;
                h = h.next;
            }
            p = p.next;
        }
        h.next = null;
        if(low.next != null) head = low.next;
        l.next = high.next;
        return head;
    }
}
