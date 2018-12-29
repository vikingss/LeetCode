package round3;

import round1.firstLevel27.TreeNode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 10:32 2018/11/1
 * @Modified By:
 */
public class No144 {
//    public List<Integer> preorderTraversal(TreeNode root) {
//        List<Integer> resList = new ArrayList<>();
//        dfs(root,resList);
//        return resList;
//    }
//
//    private void dfs(TreeNode root, List<Integer> resList) {
//        if(root == null) return;
//        resList.add(root.val);
//        if(root.left != null) dfs(root.left,resList);
//        if(root.right != null) dfs(root.right,resList);
//    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> resList = new ArrayList<>();
        if(root == null) return resList;
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode cur = root;
        stack.push(root);
        while(cur != null || !stack.isEmpty()){
            if(cur != null){
                stack.push(cur);
                resList.add(cur.val);
                cur = cur.left;
            }else{
                cur = stack.pop().right;
            }
        }
        return resList;
    }
}
