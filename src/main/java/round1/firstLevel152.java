package round1;

import round1.firstLevel21.ListNode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 15:16 2018/9/29
 * @Modified By:
 */
public class firstLevel152 {
    public static ListNode sortList(ListNode head) {
        if(head ==  null || head.next == null) return  head;
        //cut to halves
        ListNode slow = head,fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode second = slow.next;
        slow.next = null;

        // sort each halves
        ListNode first = sortList(head);
        second = sortList(second);
        //merge
        return merge(first,second);
    }

    private static ListNode merge(ListNode first, ListNode second) {
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
    public static void main(String[] args) {
        ListNode p1 = new ListNode(1);
        ListNode p2 = new ListNode(2);
        ListNode p3 = new ListNode(3);
        ListNode p4 = new ListNode(4);
        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
        sortList(p1);
    }
}
