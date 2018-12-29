package round2;

import round1.firstLevel141.TreeLinkNode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 10:04 2018/10/18
 * @Modified By:
 */
public class No116 {
    public void connect(TreeLinkNode root) {
        if(root == null) return;
        if(root.left != null){
            root.left.next = root.right;
            if(root.next != null){
                root.right.next = root.next.left;
            }
        }
        connect(root.left);
        connect(root.right);
    }
}
