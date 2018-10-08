package com.viki.leetcode;

import com.viki.leetcode.firstLevel27.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 给定一个非空二叉树, 返回一个由每层节点平均值组成的数组.

 示例 1:

 输入:
 3
 / \
 9  20
 /  \
 15   7
 输出: [3, 14.5, 11]
 解释:
 第0层的平均值是 3,  第1层是 14.5, 第2层是 11. 因此返回 [3, 14.5, 11].
 注意：

 节点值的范围在32位有符号整数范围内。
 */
public class firstLevel60 {
    public List<Double> averageOfLevels(TreeNode root) {
        if(root == null){
            return new ArrayList<Double>();
        }
        List<Double> resList = new ArrayList<Double>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            long sum = 0,count = 0;
            Queue<TreeNode> tmp = new LinkedList<TreeNode>();
            while(!queue.isEmpty()) {
                TreeNode p = queue.remove();
                sum += p.val;
                count++;
                if (p.left != null) {
                    tmp.add(p.left);
                }
                if (p.right != null) {
                    tmp.add(p.right);
                }
            }
            queue =  tmp;
            resList.add(sum * 1.0 / count);


        }
        return resList;

    }
}
