package round3;

import com.viki.leetcode.firstLevel21.ListNode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 09:36 2018/11/3
 * @Modified By:
 */
public class No148 {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode second = slow.next;
        slow.next = null;
        second = sortList(second);
        ListNode first = sortList(head);
        return merge(first,second);
    }

    private ListNode merge(ListNode first, ListNode second) {
        ListNode res = new ListNode(-1);
        ListNode p = res;
        while(first != null && second != null){
            if(first.val <= second.val){
                p.next = first;
                first = first.next;
            }else{
                p.next = second;
                second = second.next;
            }
            p = p.next;

        }
        while(first != null){
            p.next = first;
            first = first.next;
            p = p.next;
        }
        while(second != null){
            p.next = second;
            second = second.next;
            p = p.next;
        }
        return res.next;
    }
}
