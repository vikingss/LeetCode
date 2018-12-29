package round1;

/**
 * 反转一个单链表。
 *
 * 示例:
 *
 * 输入: 1->2->3->4->5->NULL 输出: 5->4->3->2->1->NULL 进阶: 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 */
public class firstLevel23 {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode reverseListByRecurise(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode node = reverseListByRecurise(head.next);
        head.next.next = head;
        head.next = null;
        return node;
    }

    public static ListNode reverseListByNoRecurise(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode pre = head;
        ListNode cur = head.next;
        ListNode tmp;
        while (cur != null){
            tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        head.next = null;
        return pre;
    }


    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        listNode.next = listNode1;
        ListNode listNode2 = new ListNode(3);
        listNode1.next = listNode2;
        ListNode head = firstLevel23.reverseListByNoRecurise(listNode);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
