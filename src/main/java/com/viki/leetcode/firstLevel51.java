package com.viki.leetcode;

import com.viki.leetcode.firstLevel27.TreeNode;

/**
 给定一个二叉树，找出其最小深度。

 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。

 说明: 叶子节点是指没有子节点的节点。

 示例:

 给定二叉树 [3,9,20,null,null,15,7],

 3
 / \
 9  20
 /  \
 15   7
 返回它的最小深度  2.


 */
public class firstLevel51 {
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        int leftD = minDepth(root.left);
        int leftR = minDepth(root.right);
        leftD = (leftD == 0 ? Integer.MAX_VALUE:leftD);
        leftR = (leftR == 0 ? Integer.MAX_VALUE:leftR);
        return leftD <  leftR ?leftD+1 : leftR+1;
    }
}
