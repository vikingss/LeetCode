package round3;

import round1.firstLevel21.ListNode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 14:05 2018/11/6
 * @Modified By:
 */
public class No203 {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode p = head;
        while(p != null){
            if(p.val != val){
                pre = pre.next;
                p = p.next;
            }else{
                pre.next = p.next;
                p = p.next;
            }
        }
        return dummy.next;
    }
}
