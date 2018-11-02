package round3;

import round2.No117.TreeLinkNode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 09:32 2018/11/2
 * @Modified By:
 */
public class No117 {
    public void connect(TreeLinkNode root) { //任意二叉树
        if(root == null) return;
        while(root != null){
            TreeLinkNode dummy =  new TreeLinkNode(0);
            TreeLinkNode cur = dummy;
            while(root !=  null){
                if(root.left != null){
                    cur.next = root.left;
                    cur = cur.next;
                }
                if(root.right != null){
                    cur.next = root.right;
                    cur = cur.next;
                }
                root = root.next;
            }
            root = dummy.next;
        }
    }
}
