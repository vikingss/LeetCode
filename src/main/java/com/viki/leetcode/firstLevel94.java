package com.viki.leetcode;

import com.viki.leetcode.firstLevel27.TreeNode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 09:28 2018/7/12
 * @Modified By:
 */
public class firstLevel94 {

    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer>  list  = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        stack.add(cur);
        while(cur != null || !stack.isEmpty()){
            cur = stack.pop();
            list.add(cur.val);
            if(cur.left!= null){
                stack.add(cur.left);
            }
            if(cur.right != null){
                stack.add(cur.right);
            }
        }
        return list;
    }

    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode cur = root;
        while(cur != null || !stack.isEmpty()){
            while(cur != null){
                stack.add(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            list.add(cur.val);
            cur = cur.right;
        }
        return list;
    }

    public List<List<Integer>> levelTraversal(TreeNode root){
        List<List<Integer>> reslist = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode cur;
        queue.add(root);
        while(!queue.isEmpty()){
            Queue<TreeNode> tmp = new LinkedList<>();
            List<Integer> list = new ArrayList<>();
            while(!queue.isEmpty()) {
                cur = queue.remove();
                list.add(cur.val);
                if (cur.left != null) {
                    tmp.add(cur.left);
                }
                if (cur.right != null) {
                    tmp.add(cur.right);
                }
            }
            queue = tmp;
            reslist.add(list);
        }
        return reslist;
    }

    public static void main(String[] args) {

    }
}
