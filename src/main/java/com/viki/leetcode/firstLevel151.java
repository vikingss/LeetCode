package com.viki.leetcode;

import com.viki.leetcode.firstLevel21.ListNode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 14:23 2018/9/29
 * @Modified By:
 */
public class firstLevel151 {

    public static void reorderList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return;
        }
        ListNode slow = head;
        ListNode fast = head;    // 找到中间结点
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode second = slow.next;    // 注意置空，分为两个链表	// 第一个链表的长度大于（+1）等于第二个链表长度
        slow.next = null;    // 反转后半链表	s
        second = reverseList(second);
        ListNode first = head;    // 合并两个链表，画图模拟	// 把第二个链表插在第一个链表中
        while (second != null) {        // 暂存第一个后续结点
            ListNode next = first.next;
            first.next = second;
            second = second.next;
            first = first.next;
            first.next = next;
            first = first.next;
        }
    } // 就地翻转链表

    private static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode next = null;
        while (head != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode p1 = new ListNode(1);
        ListNode p2 = new ListNode(2);
        ListNode p3 = new ListNode(3);
        ListNode p4 = new ListNode(4);
        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
        reorderList(p1);
    }
}
