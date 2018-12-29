package round2;

import round1.firstLevel27.TreeNode;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 09:38 2018/10/22
 * @Modified By:
 */
public class No144 {

//    public List<Integer> preorderTraversal(TreeNode root) {
//        List<Integer> resList = new ArrayList<>();
//        if (root == null) {
//            return resList;
//        }
//        resList.add(root.val);
//        resList.addAll(preorderTraversal(root.left));
//        resList.addAll(preorderTraversal(root.right));
//        return resList;
//    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> resList = new ArrayList<>();
        if (root == null) {
            return resList;
        }
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode p = root;
        while(p != null || !stack.isEmpty()){
            if(p != null){
                stack.push(p);
                resList.add(p.val);
                p = p.left;
            }else{
                p = stack.pop().right;
            }
        }
        return resList;
    }
}
