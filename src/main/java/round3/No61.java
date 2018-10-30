package round3;

import com.viki.leetcode.firstLevel21.ListNode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 14:28 2018/10/30
 * @Modified By:
 */
public class No61 {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k <= 0) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode p = head;
        int cnt = 0;
        while(p != null){
            cnt++;
            p = p.next;
        }
        ListNode pre = dummy;
        p = head;
        k = cnt - k % cnt;
        if(k == cnt) return head; //sample:cnt = 7,k = 7; 正好移动一圈
        while(k-- > 0){
            pre = pre.next;
            p = p.next;
        }
        ListNode second = pre.next;
        ListNode tail = second;
        while(tail.next != null)tail = tail.next;
        pre.next = null;
        tail.next = dummy.next;
        dummy.next = second;
        return dummy.next;
    }
}
