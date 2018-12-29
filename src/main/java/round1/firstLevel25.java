package round1;


/**

 请判断一个链表是否为回文链表。

 示例 1:

 输入: 1->2
 输出: false
 示例 2:

 输入: 1->2->2->1
 输出: true
 进阶：
 你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
 */
public class firstLevel25 {
    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    public static boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }

        ListNode p = head;
        int count = 0;
        while(p != null){
            p = p.next;
            count++;
        }
        p = head;
        if(count % 2 == 0) {
            for (int i = 0; i < count / 2 - 1; ++i) {
                p = p.next;
            }
        }else{
            for (int i = 0; i < count / 2; ++i) {
                p = p.next;
            }
        }
        ListNode q = p.next;
        p.next = null;
        q = reverse(q);
        p = head;
        while(q != null){
            if(p.val == q.val){
                p = p.next;
                q = q.next;
            }else{
                return false;
            }
        }
        return true;

    }

    public static ListNode reverse(ListNode head){
        if(head == null || head.next == null){
            return head;
        }

        ListNode pre = head;
        ListNode cur = head.next;
        ListNode tmp;
        while(cur != null){
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
        ListNode listNode2 = new ListNode(2);
        listNode1.next = listNode2;
        ListNode listNode3 = new ListNode(1);
        listNode2.next = listNode3;
        System.out.println(firstLevel25.isPalindrome(listNode));
    }
}
