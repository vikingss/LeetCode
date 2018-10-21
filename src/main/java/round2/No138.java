package round2;

import java.util.HashMap;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 11:08 2018/10/20
 * @Modified By:
 */
public class No138 {

    class RandomListNode {

        int label;
        RandomListNode next, random;

        RandomListNode(int x) {
            this.label = x;
        }
    }
    public RandomListNode copyRandomList(RandomListNode head) {
        if(head == null) return null;
        HashMap<RandomListNode,RandomListNode> map = new HashMap<>();
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
        while(oldp  != null){
            newp.random = map.get(newp.random);
            oldp = oldp.next;
            newp = newp.next;
        }
        return newhead;
    }
}
