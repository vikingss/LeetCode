package round2;

import com.viki.leetcode.firstLevel21.ListNode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 13:56 2018/10/26
 * @Modified By:
 */
public class No234 {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast != null){
            slow = slow.next;
        }
        ListNode second = reverse(slow);
        slow = head;
        while(second != null){
            if(slow.val != second.val) return false;
            slow = slow.next;
            second = second.next;
        }
        return true;
    }

    private ListNode reverse(ListNode head) {

        ListNode p = head;
        ListNode next = head.next;
        head.next = null;
        while(next != null){
            ListNode tmp = next.next;
            next.next = p;
            p = next;
            next = tmp;
        }
        return p;
    }


}
