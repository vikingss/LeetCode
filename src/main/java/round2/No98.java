package round2;

import com.viki.leetcode.firstLevel27.TreeNode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 09:56 2018/10/17
 * @Modified By:
 */
public class No98 {

    public boolean isValidBST(TreeNode root) {
        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);

    }

    private boolean isValid(TreeNode root, long minValue, long maxValue) {
        if (root == null)
            return true;
        return root.val > minValue && root.val < maxValue && isValid(root.left, minValue, root.val)
            && isValid(root.right, root.val, maxValue);
    }
}
