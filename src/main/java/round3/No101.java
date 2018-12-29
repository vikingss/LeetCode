package round3;

import round1.firstLevel27.TreeNode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 14:09 2018/11/1
 * @Modified By:
 */
public class No101 {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return symmetric(root.left,root.right);
    }

    private boolean symmetric(TreeNode left, TreeNode right) {
        if(left == null || right == null) return left == right;
        return left.val == right.val ? symmetric(left.left,right.right) && symmetric(left.right,right.left) : false;
    }
}
