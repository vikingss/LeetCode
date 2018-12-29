package round3;

import round1.firstLevel21.ListNode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 23:18 2018/10/28
 * @Modified By:
 */
public class No19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode p = dummy;
        ListNode q = dummy;
        for(int i = 1; i <= n + 1; i++){
            q = q.next;
        }
        while(q != null){
            p = p.next;
            q = q.next;
        }
        p.next = p.next.next;
        return dummy.next;
    }
}
