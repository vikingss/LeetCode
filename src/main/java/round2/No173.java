package round2;

import round1.firstLevel27.TreeNode;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 15:57 2018/10/24
 * @Modified By:
 */
public class No173 {
    class BSTIterator {
        Deque<TreeNode> stack = new ArrayDeque<>();

        public BSTIterator(TreeNode root) {
            TreeNode cur = root;
            while(cur != null){
                stack.push(cur);
                cur = cur.left;
            }
        }

        /** @return whether we have a next smallest number */
        public boolean hasNext() {
            return !stack.isEmpty();
        }

        /** @return the next smallest number */
        public int next() {
            TreeNode next = stack.pop();
            TreeNode cur = next.right;
            while(cur != null){
                stack.push(cur);
                cur = cur.left;
            }
            return next.val;
        }
    }

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */



}
