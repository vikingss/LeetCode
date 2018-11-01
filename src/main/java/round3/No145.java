package round3;

import com.viki.leetcode.firstLevel27.TreeNode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 10:41 2018/11/1
 * @Modified By:
 */
public class No145 {
//    public List<Integer> postorderTraversal(TreeNode root) {
//        List<Integer> resList = new ArrayList<>();
//        dfs(resList,root);
//        return resList;
//    }
//
//    private void dfs(List<Integer> resList, TreeNode root) {
//        if(root == null) return;
//        if(root.left != null) dfs(resList,root.left);
//        if(root.right != null) dfs(resList,root.right);
//        resList.add(root.val);
//    }

    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> resList = new LinkedList<>();
        if(root == null) return resList;
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode cur = root;
        while(cur != null || !stack.isEmpty()){
            if(cur != null){
                stack.push(cur);
                resList.addFirst(cur.val); //巧妙
                cur = cur.right;
            }else{
                cur = stack.pop().left;
            }
        }
        return resList;
    }
}
