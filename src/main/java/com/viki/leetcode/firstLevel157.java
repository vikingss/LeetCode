package com.viki.leetcode;

import com.viki.leetcode.firstLevel27.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 10:05 2018/9/30
 * @Modified By:
 */
public class firstLevel157 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> resList = new ArrayList<>();
        if(root == null) return resList;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            resList.add(queue.peek().val);
            LinkedList<TreeNode> tmp = new LinkedList<>();
            while(!queue.isEmpty()) {
                TreeNode next = queue.poll();
                if (next.right != null)
                    tmp.add(next.right);
                if (next.left != null)
                    tmp.add(next.left);
            }
            queue = tmp;
        }
        return resList;
    }
}
