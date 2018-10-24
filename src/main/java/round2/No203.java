package round2;

import com.viki.leetcode.firstLevel21.ListNode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 17:37 2018/10/24
 * @Modified By:
 */
public class No203 {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
        while(pre.next != null){
            if(pre.next.val == val){
                ListNode tmp = pre.next.next;
                pre.next = tmp;
            }else{
                pre = pre.next;
            }
        }
        return dummy.next;
    }
}
