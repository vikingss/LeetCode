package com.viki.leetcode;

import com.viki.leetcode.firstLevel27.TreeNode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 23:08 2018/6/23
 * @Modified By:
 */
public class firstLevel50 {
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        if(Math.abs(deep(root.left) - deep(root.right)) > 1){
            return false;
        }else{
            return isBalanced(root.left) && isBalanced(root.right);
        }
    }

    private int deep(TreeNode node) {
        if(node == null){
            return 0;
        }
        return Math.max(deep(node.left),deep(node.right)) + 1;

    }


}
