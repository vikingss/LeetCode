package round2;

import com.viki.leetcode.firstLevel21.ListNode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 10:52 2018/10/1
 * @Modified By:
 */
public class No2 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        int curry = 0;
        ListNode p = dummy;
        while(l1 != null || l2 != null || curry != 0){
            if(l1 != null){
                curry += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                curry += l2.val;
                l2 = l2.next;
            }
            p.next = new ListNode(curry % 10);
            curry /= 10;
            p = p.next;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        ListNode p1 = new ListNode(1);
        ListNode p2 = new ListNode(2);
        ListNode p3 = new ListNode(3);
        ListNode p4 = new ListNode(4);
        p1.next = p2;
        p3.next = p4;
        ListNode res = addTwoNumbers(p1,p2);
    }
}
