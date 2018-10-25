package round2;

import com.viki.leetcode.firstLevel27.TreeNode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 16:44 2018/10/25
 * @Modified By:
 */
public class No617 {

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return null;
        }
        int sum1 = t1 == null ? 0 : t1.val;
        int sum2 = t2 == null ? 0 : t2.val;
        TreeNode newNode = new TreeNode(sum1 + sum2);
        newNode.left = mergeTrees(t1 != null ? t1.left : null, t2 != null ? t2.left : null);
        newNode.right = mergeTrees(t1 != null ? t1.right : null, t2 != null ? t2.right : null);
        return newNode;
    }
}
