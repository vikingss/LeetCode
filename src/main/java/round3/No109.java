package round3;

import round1.firstLevel21.ListNode;
import round1.firstLevel27.TreeNode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 15:00 2018/11/1
 * @Modified By:
 */
public class No109 {
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null) return null;
        return build(head,null);
    }

    private TreeNode build(ListNode head, ListNode tail) {
        if(head == tail) return null;
        ListNode slow = head,fast = head;
        while(fast != tail && fast.next != tail){
            slow = slow.next;
            fast = fast.next.next;
        }
        TreeNode root = new TreeNode(slow.val);
        root.left = build(head,slow);
        root.right = build(slow.next,tail);
        return root;
    }
}
