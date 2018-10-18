package round2;


/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 10:11 2018/10/18
 * @Modified By:
 */
public class No117 {
    public class TreeLinkNode {
      int val;
      TreeLinkNode left, right, next;
      TreeLinkNode(int x) { val = x; }
  }
    public void connect(TreeLinkNode root) {
        while(root != null){
            TreeLinkNode dummy = new TreeLinkNode(0);
            TreeLinkNode cur = dummy;
            while(root != null){
                if(root.left != null){
                    cur.next =  root.left;
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
