package com.viki.leetcode;

/**

 给定一个链表，判断链表中是否有环。

 进阶：
 你能否不使用额外空间解决此题？
 */
public class firstLevel26 {
    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static boolean hasCycle(ListNode head) {
        if(head ==  null || head.next == null){
            return false;
        }
        ListNode p = head;
        ListNode q = head;
        while(p != null && q  != null){
            p = p.next;
            q = q.next;
            if(q != null){
                q = q.next;
            }
            if(q !=  null && p.val == q.val){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        listNode.next = listNode1;
//        ListNode listNode2 = new ListNode(2);
//        listNode1.next = listNode2;
//        ListNode listNode3 = new ListNode(1);
//        listNode2.next = listNode3;
        System.out.println(firstLevel26.hasCycle(listNode));
    }
}
