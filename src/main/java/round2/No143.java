package round2;

import round1.firstLevel21.ListNode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 23:03 2018/10/21
 * @Modified By:
 */
public class No143 {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null) return;

        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode second = slow.next;//第二个链表头
        slow.next = null;
        second = reverse(second);//反转第二个链表
        ListNode first = head;
        while(second != null){
            ListNode next = first.next;
            first.next = second;
            second = second.next;
            first = first.next;
            first.next = next;
            first = first.next;
        }
    }

    private ListNode reverse(ListNode node) {//就地反转
        ListNode prev = null;
        ListNode next = null;
        while(node != null){
            next = node.next;
            node.next = prev;
            prev = node;
            node = next;

        }
        return prev;
    }
}
