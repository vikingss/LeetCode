package round3;

import round1.firstLevel27.TreeNode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 14:33 2018/11/1
 * @Modified By:
 */
public class No104 {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}
