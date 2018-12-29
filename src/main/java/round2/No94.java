package round2;

import round1.firstLevel27.TreeNode;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 16:48 2018/10/16
 * @Modified By:
 */
public class No94 {
//    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> resList = new ArrayList<>();
//        dfs(root,resList);
//        return  resList;
//    }
//
//    private void dfs(TreeNode root, List<Integer> resList) {
//        if(root != null){
//            if(root.left != null){
//                dfs(root.left,resList);
//            }
//            resList.add(root.val);
//            if(root.right != null){
//                dfs(root.right,resList);
//            }
//        }
//    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> resList = new ArrayList<>();
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode cur = root;
        while(cur != null || !stack.isEmpty()){
            while(cur != null){
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            resList.add(cur.val);
            cur = cur.right;
        }
        return resList;
    }
}
