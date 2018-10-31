package round3;

import com.viki.leetcode.firstLevel21.ListNode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 16:22 2018/10/31
 * @Modified By:
 */
public class No83 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode p = head;
        while(p != null && p.next != null){
            if(p.val != p.next.val){
                pre = pre.next;
                p = p.next;
            }else{
                ListNode next = find(p);
                p.next = next;
                p = p.next;
                pre = pre.next;
            }
        }
        return dummy.next;
    }

    private ListNode find(ListNode p) {
        while(p != null && p.next != null){
            if(p.val == p.next.val) p = p.next;
            else return p.next;
        }
        return null;
    }
}
