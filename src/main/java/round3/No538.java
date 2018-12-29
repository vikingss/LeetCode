package round3;

import round1.firstLevel27.TreeNode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 16:35 2018/11/21
 * @Modified By:
 */
public class No538 {
    private int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        convert(root);
        return root;
    }

    private void convert(TreeNode root) {
        if(root == null) return;
        convert(root.right);
        root.val += sum;
        sum = root.val;
        convert(root.left);
    }
}
