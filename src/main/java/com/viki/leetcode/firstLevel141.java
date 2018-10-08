package com.viki.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 15:00 2018/8/6
 * @Modified By:
 */
public class firstLevel141 {

    public class TreeLinkNode {

        TreeLinkNode left;
        TreeLinkNode right;
        TreeLinkNode next;
    }

    public void connect(TreeLinkNode root) {
        if(root == null)
            return;

        if(root.left != null){
            root.left.next = root.right;
            if(root.next != null)
                root.right.next = root.next.left;
        }

        connect(root.left);
        connect(root.right);

    }


}
