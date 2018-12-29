package round1;

import round1.firstLevel21.ListNode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 13:27 2018/7/4
 * @Modified By:
 */
public class firstLevel80 {
    public static ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode p = head;
        pre = p;
        p = p.next;

        while(p != null){
            //判断插入位置
            ListNode q = dummy;
            while(q.next != null){
                if(p.val >= q.val && p.val <= q.next.val){
                    break;
                }else if(p.val > q.next.val){
                    q = q.next;
                }
            }
            if(pre == q){
                pre = p;
                p = p.next;
            }else {
                pre.next = p.next;
                p.next = q.next;
                q.next = p;
                p = pre.next;
            }
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(-1);
        ListNode p1 = new ListNode(5);
        ListNode q1 = new ListNode(3);
        ListNode p2 = new ListNode(4);
        ListNode q2 = new ListNode(0);
//        ListNode q3 = new ListNode(7);
//        ListNode q4 = new ListNode(6);
        head.next = p1;
        p1.next = q1;
        q1.next = p2;
        p2.next = q2;
//        q2.next = q3;
//        q3.next = q4;

        System.out.println(insertionSortList(head));
    }
}
