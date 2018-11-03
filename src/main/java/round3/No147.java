package round3;

import com.viki.leetcode.firstLevel21.ListNode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 09:12 2018/11/3
 * @Modified By:
 */
public class No147 {
    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode(0);
        ListNode pre = dummy;//新链表头
        ListNode cur = head;
        ListNode next = null;
        while(cur != null){
            next = cur.next;
            while(pre != null && pre.next.val < cur.val){
                pre = pre.next;
            }
            cur.next = pre.next;
            pre.next = cur;
            pre = dummy; //保持在头
            cur = next;
        }
        return dummy.next;
    }
}
