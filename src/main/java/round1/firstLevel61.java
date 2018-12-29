package round1;

import round1.firstLevel27.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 给定一个二叉树，返回其按层次遍历的节点值。 （即逐层地，从左到右访问所有节点）。

 例如:
 给定二叉树: [3,9,20,null,null,15,7],

 3
 / \
 9  20
 /  \
 15   7
 返回其层次遍历结果：

 [
 [3],
 [9,20],
 [15,7]
 ]
 */
public class firstLevel61 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> resList = new ArrayList<List<Integer>>();
        if(root == null){
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            Queue<TreeNode> tmp = new LinkedList<TreeNode>();
            List<Integer> list = new ArrayList<Integer>();
            while(!queue.isEmpty()){
                TreeNode p = queue.remove();
                list.add(p.val);
                if(p.left != null){
                    tmp.add(p.left);
                }
                if(p.right != null){
                    tmp.add(p.right);
                }
            }
            resList.add(list);
            queue = tmp;
        }
        return resList;
    }
}
