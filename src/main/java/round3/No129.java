package round3;

import com.viki.leetcode.firstLevel27.TreeNode;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 14:47 2018/11/2
 * @Modified By:
 */
public class No129 {
    private int sum = 0;

    public int sumNumbers(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return root.val;
        sum(root,0);
        return sum;
    }

    private void sum(TreeNode root, int currentSum) {
        if(root == null) return ;
        int pathSum = currentSum * 10 + root.val;
        if(root.left == null && root.right == null) sum += pathSum;
        else{
            sum(root.right,pathSum);
            sum(root.left,pathSum);
        }

    }
}
