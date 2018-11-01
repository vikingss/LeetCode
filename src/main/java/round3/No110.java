package round3;

import com.viki.leetcode.firstLevel27.TreeNode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 15:06 2018/11/1
 * @Modified By:
 */
public class No110 {
    public boolean isBalanced(TreeNode root) {
        if(root == null || root.left == null && root.right == null) return true;
        return Math.abs(height(root.left) - height(root.right)) < 2 ? isBalanced(root.left) && isBalanced(root.right) : false;
    }

    private int height(TreeNode node) {
        if(node == null) return 0;
        if(node.left == null && node.right == null) return 1;
        return Math.max(height(node.left),height(node.right)) + 1;
    }
}
