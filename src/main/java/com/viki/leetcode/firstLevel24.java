package com.viki.leetcode;


/**
 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。

 示例：

 输入：1->2->4, 1->3->4
 输出：1->1->2->3->4->4
 */
public class firstLevel24 {
    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;
        while(l1 != null && l2 != null){
            if(l2.val > l1.val){
                dummy.next = l1;
                l1 = l1.next;
                dummy = dummy.next;
            }else{
                dummy.next = l2;
                l2 = l2.next;
                dummy = dummy.next;
            }
        }
        while(l1 != null){
            dummy.next = l1;
            l1 = l1.next;
            dummy = dummy.next;

        }
        while(l2 != null){
            dummy.next = l2;
            l2 = l2.next;
            dummy = dummy.next;
        }
        return p.next;
    }
}
