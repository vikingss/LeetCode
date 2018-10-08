package com.viki.leetcode;

/**
 给定一个二叉树，检查它是否是镜像对称的。

 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。

 1
 / \
 2   2
 / \ / \
 3  4 4  3
 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:

 1
 / \
 2   2
 \   \
 3    3
 说明:

 如果你可以运用递归和迭代两种方法解决这个问题，会很加分。
 */
public class firstLevel29 {
    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return symmetric(root.left,root.right);
    }

    private boolean symmetric(TreeNode p, TreeNode q) {
        if(p == null  && q == null){//都为空
            return true;
        }else if(p == null || q ==  null){
            return false;
        }
        return p.val == q.val && symmetric(p.left,q.right) && symmetric(p.right,q.left);
    }
}
