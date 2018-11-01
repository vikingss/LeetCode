package round3;

import com.viki.leetcode.firstLevel27.TreeNode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 14:06 2018/11/1
 * @Modified By:
 */
public class No100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if((p == null && q != null) || (p != null && q == null)) return false;
        return p.val == q.val ? isSameTree(p.left,q.left) && isSameTree(p.right,q.right) : false;
    }
}
