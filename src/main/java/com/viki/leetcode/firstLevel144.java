package com.viki.leetcode;

import com.viki.leetcode.firstLevel27.TreeNode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 14:31 2018/9/28
 * @Modified By:
 */
public class firstLevel144 {
    private int sumOfNumbers = 0;
    public int sumNumbers(TreeNode root) {
        if(root == null) return 0;
        sumNumbers(root,0);
        return sumOfNumbers;
    }

    private void sumNumbers(TreeNode root, int currentNumbers) {
        if(root == null) return;
        int pathNumbers = currentNumbers * 10 + root.val;
        if(root.left == null && root.right == null){
            sumOfNumbers += pathNumbers;
        }else{
            sumNumbers(root.left,pathNumbers);
            sumNumbers(root.right,pathNumbers);
        }
    }
}
