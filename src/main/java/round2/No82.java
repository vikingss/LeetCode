package round2;

import com.viki.leetcode.firstLevel21.ListNode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 11:18 2018/10/16
 * @Modified By:
 */
public class No82 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode p = head;
        ListNode pre = dummy;
        while(p != null){
            while(p.next !=  null && p.val == p.next.val){
                p = p.next;
            }
            if(pre.next == p){
                pre = pre.next;
            }else{
                pre.next = p.next;
            }
            p = p.next;
        }
        return dummy.next;
    }
}
