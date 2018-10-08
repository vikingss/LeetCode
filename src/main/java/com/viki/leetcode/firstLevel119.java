package com.viki.leetcode;

import com.viki.leetcode.firstLevel21.ListNode;
import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个链表和一个特定值 x，对链表进行分隔，使得所有小于 x 的节点都在大于或等于 x 的节点之前。
 *
 * 你应当保留两个分区中每个节点的初始相对位置。
 *
 * 示例:
 *
 * 输入: head = 1->4->3->2->5->2, x = 3 输出: 1->2->2->4->3->5
 */
public class firstLevel119 {

    public static ListNode partition(ListNode head, int x) {
        ListNode dummy1 = new ListNode(0),dummy2 = new ListNode(0);
        ListNode cur1 = dummy1,cur2 = dummy2;
        ListNode p = head;
        while(p != null){
            if(p.val < x){
                cur1.next = p;
                cur1 = p;
            }else{
                cur2.next = p;
                cur2= p;
            }
            p = p.next;
        }
        cur2.next = null;
        cur1.next = dummy2.next;
        return dummy1.next;

    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode p1 = new ListNode(4);
        ListNode p2 = new ListNode(3);
        ListNode p3 = new ListNode(2);
        ListNode p4 = new ListNode(5);
        ListNode p5 = new ListNode(2);

        head.next = p1;
        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
        p4.next = p5;

        partition(head,3);
    }
}
