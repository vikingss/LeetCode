package round1;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 15:00 2018/8/6
 * @Modified By:
 */
public class firstLevel141 {

    public static class TreeLinkNode {

        public TreeLinkNode left;
        public TreeLinkNode right;
        public TreeLinkNode next;
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
