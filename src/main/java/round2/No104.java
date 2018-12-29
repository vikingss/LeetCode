package round2;

import round1.firstLevel27.TreeNode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 11:23 2018/10/17
 * @Modified By:
 */
public class No104 {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;
        return 1 + Math.max(maxDepth(root.right),maxDepth(root.left));
    }
}
