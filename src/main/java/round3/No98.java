package round3;

import com.viki.leetcode.firstLevel27.TreeNode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 14:00 2018/11/1
 * @Modified By:
 */
public class No98 {
    public boolean isValidBST(TreeNode root) {
        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);


    }

    private boolean isValid(TreeNode root, long minValue, long maxValue) {
        if(root == null) return true;
        return root.val < maxValue && root.val > minValue && isValid(root.left,minValue,root.val)
            && isValid(root.right,root.val,maxValue);
    }

}
