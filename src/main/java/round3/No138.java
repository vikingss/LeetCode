package round3;


import java.util.HashMap;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 15:49 2018/11/2
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
        RandomListNode newHead = new RandomListNode(head.label);
        map.put(head,newHead);
        RandomListNode oldP = head.next;
        RandomListNode newP = newHead;
        while(oldP != null){
            RandomListNode newNode = new RandomListNode(oldP.label);
            newP.next = newNode;
            map.put(oldP,newNode);
            oldP = oldP.next;
            newP = newP.next;
        }
        oldP = head;
        newP = newHead;
        while(oldP != null){
            newP.random = map.get(oldP.random);
            oldP = oldP.next;
            newP = newP.next;
        }
        return newHead;
    }
}
