package com.viki.leetcode;

import java.util.HashMap;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 11:16 2018/9/29
 * @Modified By:
 */
public class firstLevel149 {

    class RandomListNode {

        int label;
        RandomListNode next, random;

        RandomListNode(int x) {
            this.label = x;
        }
    }

    ;

    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null) {
            return null;
        }
        HashMap<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
        RandomListNode newhead = new RandomListNode(head.label);
        map.put(head, newhead);
        RandomListNode oldp = head.next;
        RandomListNode newp = newhead;
        while (oldp != null) {
            RandomListNode newnode = new RandomListNode(oldp.label);
            map.put(oldp, newnode);
            newp.next = newnode;

            oldp = oldp.next;
            newp = newp.next;
        }

        oldp = head;
        newp = newhead;
        while (oldp != null) {
            newp.random = map.get(oldp.random);
            oldp = oldp.next;
            newp = newp.next;
        }

        return newhead;
    }
}
