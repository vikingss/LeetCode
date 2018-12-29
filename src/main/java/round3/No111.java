package round3;

import round1.firstLevel27.TreeNode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 15:14 2018/11/1
 * @Modified By:
 */
public class No111 {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null) return 1+minDepth(root.right);
        if(root.right == null) return 1+minDepth(root.left);
        return Math.min(minDepth(root.left),minDepth(root.right)) + 1;
    }
}
