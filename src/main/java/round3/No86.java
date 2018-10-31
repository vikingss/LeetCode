package round3;

import com.viki.leetcode.firstLevel21.ListNode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 16:36 2018/10/31
 * @Modified By:
 */
public class No86 {
    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null) return head;
        ListNode low = new ListNode(-1);
        ListNode high = new ListNode(-1);
        ListNode p = head,l = low,h = high;
        while(p != null){
            if(p.val < x){
                l.next = p;
                l = l.next;
                p = p.next;
            }else{
                h.next = p;
                h = h.next;
                p = p.next;
            }

        }
        h.next = null;
        if(low.next != null) head = low.next;
        l.next = high.next;
        return head;
    }
}
