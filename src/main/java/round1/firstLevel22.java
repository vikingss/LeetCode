package round1;

/**
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 *
 * 示例：
 *
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 *
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5. 说明：
 *
 * 给定的 n 保证是有效的。
 *
 * 进阶：
 *
 * 你能尝试使用一趟扫描实现吗？
 */
public class firstLevel22 {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode preNode = head;
        ListNode curNode = head;

        for (int i = 0; i < n; i++) {
            curNode = curNode.next;
        }

        if (curNode == null) {
            return preNode.next;
        }

        while (curNode.next != null) {
            preNode = preNode.next;
            curNode = curNode.next;
        }

        preNode.next = preNode.next.next;

        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode p = new ListNode(2);
        head.next = p;
        System.out.println(removeNthFromEnd(head,1).val);

    }
}
