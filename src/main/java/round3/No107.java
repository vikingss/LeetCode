package round3;

import round1.firstLevel27.TreeNode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 14:35 2018/11/1
 * @Modified By:
 */
public class No107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> resList = new LinkedList<>();
        if(root == null) return resList;
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int levelNum = queue.size();
            for(int i = 0; i < levelNum; ++i){
                TreeNode cur = queue.poll();
                list.add(cur.val);
                if(cur.left != null) queue.add(cur.left);
                if(cur.right != null) queue.add(cur.right);
            }
            resList.addFirst(list);
        }
        return resList;
    }
}
