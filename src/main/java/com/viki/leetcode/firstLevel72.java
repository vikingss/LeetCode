package com.viki.leetcode;

import com.viki.leetcode.firstLevel21.ListNode;

/**
 * Given a singly linked list, determine if it is a palindrome.
 *
 * Example 1:
 *
 * Input: 1->2 Output: false Example 2:
 *
 * Input: 1->2->2->1 Output: true Follow up: Could you do it in O(n) time and O(1) space?
 */
public class firstLevel72 {

    public static boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null) {
            return false;
        }
        int length = 0;
        ListNode p = head;
        while (p != null) {
            p = p.next;
            length++;
        }
        ListNode pre = head;
        ListNode q = head;
        int i = 0;
        while (i < length / 2) {
            pre = q;
            q = q.next;
            i++;
        }
        if (length % 2 == 1) {
            pre = q;
            q = q.next;
        }
        pre.next = null;
        //reverse last part
        q = reverse(q);
        p = head;
        while (q != null) {
            if (p.val != q.val) {
                return false;
            }
            p = p.next;
            q = q.next;
        }
        return true;

    }

    public static ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode pre = head;
        ListNode p = head.next;
        while (p != null) {
            ListNode tmp = p.next;
            if(pre == head) {
                pre.next = null;
            }
            p.next = pre;
            pre = p;
            p = tmp;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode p = new ListNode(2);
        ListNode q = new ListNode(2);
        ListNode p1 = new ListNode(1);
//        ListNode q1 = new ListNode(1);
        head.next = p;
        p.next = q;
        q.next = p1;
//        p1.next = q1;
//        q1.next = null;
        System.out.println(isPalindrome(head));

    }
}
