package round3;

import com.viki.leetcode.firstLevel21.ListNode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 16:27 2018/11/2
 * @Modified By:
 */
public class No143 {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;
        ListNode slow = head,fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode second = slow.next;
        slow.next = null;
        second = reverseList(second);
        ListNode first = head;
        while(second != null){
            ListNode next = first.next;
            first.next  = second;
            second = second.next;
            first = first.next;
            first.next = next;
            first = first.next;
        }
    }

    private ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode pre = null;
        ListNode tmp = null;
        while(head != null) {
            tmp = head.next;
            head.next = pre;
            pre = head;
            head = tmp;
        }
        return pre;
    }
}
