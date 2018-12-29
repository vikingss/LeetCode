package round2;

import round1.firstLevel21.ListNode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 11:11 2018/10/16
 * @Modified By:
 */
public class No83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode p = head;
        while(p != null){
            if(p.next == null) break;
            if(p.val == p.next.val) p.next = p.next.next;
            else p = p.next;
        }
        return head;
    }
}
