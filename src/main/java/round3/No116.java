package round3;


import round1.firstLevel141;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 09:20 2018/11/2
 * @Modified By:
 */
public class No116 {

    public void connect(firstLevel141.TreeLinkNode root) { //完全二叉树
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
