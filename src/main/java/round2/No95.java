package round2;

import com.viki.leetcode.firstLevel27.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 09:38 2018/10/17
 * @Modified By:
 */
public class No95 {

    public List<TreeNode> generateTrees(int n) {
        if (n < 1) {
            return new ArrayList<>();
        }
        return helper(1, n);

    }

    private List<TreeNode> helper(int start, int end) {
        List<TreeNode> resList = new ArrayList<>();
        if (start > end) {
            resList.add(null);
            return resList;
        }
        for (int i = start; i <= end; ++i) {
            List<TreeNode> leftNodes = helper(start, i - 1);
            List<TreeNode> rightNodes = helper(i + 1, end);
            for (TreeNode left : leftNodes) {
                for (TreeNode right : rightNodes) {
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;
                    resList.add(root);
                }
            }
        }
        return resList;
    }

}
