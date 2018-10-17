package round2;

import com.viki.leetcode.firstLevel27.TreeNode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 13:42 2018/10/17
 * @Modified By:
 */
public class No105 {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(0, 0, inorder.length - 1, preorder, inorder);
    }

    private TreeNode build(int preStart, int inStart, int inEnd, int[] preorder, int[] inorder) {
        if (preStart >= preorder.length || inStart > inEnd) {
            return null;
        }
        int index = preStart;
        TreeNode root = new TreeNode(preorder[preStart]);
        for (int i = inStart; i <= inEnd; ++i) {
            if (inorder[i] == root.val) {
                index = i;
            }
        }
        //preStart + inIndex - inStart + 1
        //Because the treenodes between inIndex and inStart are all left subtree nodes,
        // which means in the preorder case, these nodes all should be in front of right subtree root.
        // So we can use preStart + inIndex - inStart + 1 to get the right subtree root.

        root.left = build(preStart + 1, inStart, index - 1, preorder, inorder);
        root.right = build(preStart + index - (inStart - 1), index + 1, inEnd, preorder, inorder);
        return root;
    }
}
