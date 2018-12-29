package round2;

import round1.firstLevel27.TreeNode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 09:46 2018/10/18
 * @Modified By:
 */
public class No114 {
    public void flatten(TreeNode root) {
        if(root == null) return;
        TreeNode left = root.left;
        TreeNode right = root.right;
        root.left = null;
        flatten(left);
        flatten(right);
        root.right = left;
        TreeNode cur = root;
        while(cur.right != null) cur = cur.right;
        cur.right = right;
    }
}
