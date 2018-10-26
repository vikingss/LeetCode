package round3;

import com.viki.leetcode.firstLevel21.ListNode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 15:31 2018/10/26
 * @Modified By:
 */
public class No2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        int curry = 0;
        ListNode p = l1,q = l2;
        ListNode dummy = new ListNode(0);
        ListNode pre = dummy;
        ListNode newNode = null;
        while(p != null || q != null){
            int sum = (p != null ? p.val:0) + (q != null ? q.val:0) + curry;
            curry = sum / 10;
            newNode = new ListNode(sum % 10);
            pre.next = newNode;
            newNode = newNode.next;
            pre = pre.next;
            if(p != null)p = p.next;
            if(q != null)q = q.next;
        }

        if(curry != 0){
            newNode = new ListNode(curry);
            pre.next = newNode;
        }
        return dummy.next;
    }
}
