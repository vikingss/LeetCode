package round3;

import round1.firstLevel27.TreeNode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 10:15 2018/11/1
 * @Modified By:
 */
public class No94 {
//    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> resList = new ArrayList<>();
//        dfs(resList,root);
//        return resList;
//    }
//
//    private void dfs(List<Integer> resList, TreeNode root) {
//        if(root == null) return;
//        if(root.left != null){
//            dfs(resList,root.left);
//        }
//        resList.add(root.val);
//        if(root.right != null){
//            dfs(resList,root.right);
//        }
//    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> resList = new ArrayList<>();
        if(root == null) return resList;
        Deque<TreeNode> stack = new ArrayDeque<>();
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
