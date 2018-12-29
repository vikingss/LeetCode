package round2;

import round1.firstLevel27.TreeNode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 09:59 2018/10/17
 * @Modified By:
 */
public class No101 {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return symmetric(root.left,root.right);
    }

    private boolean symmetric(TreeNode left, TreeNode right) {
        if(left == null || right == null) return left == right;
        if(left.val != right.val) return false;
        return symmetric(left.left,right.right) && symmetric(right.left,left.right);
    }


}
