package round2;

import round1.firstLevel27.TreeNode;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 14:03 2018/10/22
 * @Modified By:
 */
public class No145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> resList = new LinkedList<>();
        if(root == null) return resList;
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode p = root;
        while(p != null || stack.isEmpty()){
            if(p != null){
                stack.push(p);
                resList.addFirst(p.val);
                p = p.right;
            }else{
                p = stack.pop().left;
            }
        }
        return resList;
    }
}
