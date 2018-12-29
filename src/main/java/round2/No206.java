package round2;

import round1.firstLevel21.ListNode;

public class No206 {
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        ListNode next = head.next;
        head.next = null;
        while(next != null){
            ListNode tmp = next.next;
            next.next = head;
            head = next;
            next = tmp;
        }
        return head;
    }


}
