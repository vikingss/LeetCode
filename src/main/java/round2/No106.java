package round2;

import round1.firstLevel27.TreeNode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 14:09 2018/10/17
 * @Modified By:
 */
public class No106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return build(postorder.length-1,0,inorder.length-1,inorder,postorder);
    }

    private TreeNode build(int postStart, int inStart, int inEnd, int[] inorder, int[] postorder) {
        if(postStart >= postorder.length || inStart > inEnd) return null;
        int index = postStart;
        TreeNode root = new TreeNode(postorder[postStart]);
        for(int i = inStart; i <= inEnd; ++i){
            if(inorder[i] == root.val) index = i;
        }
        root.right = build(postStart-1,index+1,inEnd,inorder,postorder);
        root.left = build(postStart - (inEnd-index)-1,inStart,index-1,inorder,postorder);
        return root;
    }
}


