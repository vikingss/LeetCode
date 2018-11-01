package round3;

import com.viki.leetcode.firstLevel27.TreeNode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 14:16 2018/11/1
 * @Modified By:
 */
public class No102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> resList = new ArrayList<>();
        if(root == null) return resList;
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int levelNum = queue.size();
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i <levelNum; ++i){
                TreeNode cur = queue.poll();
                list.add(cur.val);
                if(cur.left != null) queue.add(cur.left);
                if(cur.right != null) queue.add(cur.right);
            }
            resList.add(list);
        }
        return resList;
    }
}
