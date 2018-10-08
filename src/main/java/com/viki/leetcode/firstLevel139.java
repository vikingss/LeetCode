package com.viki.leetcode;

import com.viki.leetcode.firstLevel21.ListNode;
import com.viki.leetcode.firstLevel27.TreeNode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 10:21 2018/8/6
 * @Modified By:
 */
public class firstLevel139 {
    public class Solution {
        public TreeNode sortedListToBST(ListNode head) {
            if(head == null) return null;
            return toBST(head,null);
        }

        private TreeNode toBST(ListNode head, ListNode tail) {
            if(head == tail) return null;
            ListNode fast = head;
            ListNode slow = head;
            while(fast != tail  && fast.next != null){
                fast = fast.next.next;
                tail = tail.next;
            }
            TreeNode node = new TreeNode(tail.val);
            node.left = toBST(fast,slow);
            node.right = toBST(slow.next,tail);
            return node;
        }
    }

}
