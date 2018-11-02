package round3;

import com.viki.leetcode.firstLevel21.ListNode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 16:18 2018/11/2
 * @Modified By:
 */
public class No142 {
    public ListNode detectCycle(ListNode head) {
        if(head == null) return head;
        ListNode slow = head,fast = head;
        boolean isCycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                isCycle = true;
                break;
            }
        }
        if(!isCycle) return null;
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
