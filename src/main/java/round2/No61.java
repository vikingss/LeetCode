package round2;

import round1.firstLevel21.ListNode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 09:27 2018/10/13
 * @Modified By:
 */
public class No61 {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return head;
        int cnt = 0;
        ListNode p = head;
        while(p != null){
            p = p.next;
            cnt++;
        }
        int pos = cnt - (k % cnt);
        if(pos == cnt) return head;
        p = head;
        for(int i = 1; i < pos; ++i){
            p = p.next;
        }
        //pre以后的全部插入头
        ListNode pre = p;
        p = p.next;
        pre.next = null;
        ListNode newHead = p;
        while(p.next != null){
            p = p.next;
        }
        p.next = head;
        return newHead;
    }
}
