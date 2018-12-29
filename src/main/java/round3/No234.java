package round3;

import round1.firstLevel21.ListNode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 17:27 2018/11/14
 * @Modified By:
 */
public class No234 {
    public static boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode q = slow.next;
        slow.next = null;
        q = reverse(q);
        slow = head;
        while(q != null){
            if(slow.val != q.val) return false;
            slow = slow.next;
            q = q.next;
        }
        return true;
    }
    public static ListNode reverse(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode prev = null;
        ListNode next = null;
        while(head != null){
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(1);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        System.out.println(isPalindrome(node1));
    }

}
