package com.viki.leetcode;

/**
 * 给定两个非空链表来表示两个非负整数。位数按照逆序方式存储，它们的每个节点只存储单个数字。将两数相加返回一个新的链表。
 *
 * 你可以假设除了数字 0 之外，这两个数字都不会以零开头。
 *
 * 示例：
 *
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4) 输出：7 -> 0 -> 8 原因：342 + 465 = 807
 */
public class firstLevel41 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;
        ListNode p = l1;
        ListNode q = l2;
        int flag = 0;
        while(p !=  null && q != null){
            ListNode s = new ListNode(p.val + q.val + flag);
            if(s.val >+ 10){
                s.val %= 10;
                flag = 1;
            }else{
                flag = 0;
            }
            dummy.next = s;
            dummy = dummy.next;
            p = p.next;
            q = q.next;
        }
        while(p != null){
            ListNode s = new ListNode(p.val + flag);
            if(s.val >+ 10){
                s.val %= 10;
                flag = 1;
            }else{
                flag = 0;
            }
            dummy.next = s;
            dummy = dummy.next;
            p = p.next;
        }
        while(q != null){
            ListNode s = new ListNode(q.val + flag);
            if(s.val >= 10){
                s.val %= 10;
                flag = 1;
            }else{
                flag = 0;
            }
            dummy.next = s;
            dummy = dummy.next;
            q = q.next;
        }
        if(flag > 0){
            ListNode s = new ListNode(flag);
            dummy.next = s;
            dummy = dummy.next;

        }
        return head.next;

    }
}
