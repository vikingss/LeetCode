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
 * @Date: Created in 14:23 2018/11/1
 * @Modified By:
 */
public class No103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> resList = new ArrayList<>();
        if(root == null) return resList;
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        int levelNum = 1;
        while(!queue.isEmpty()){
            LinkedList<Integer> list = new LinkedList<>();
            int tmp = queue.size();
            for(int i = 0; i < tmp; ++i){
                TreeNode cur = queue.poll();
                if(levelNum % 2 == 0) list.addFirst(cur.val);
                else list.add(cur.val);
                if(cur.left != null) queue.add(cur.left);
                if(cur.right != null) queue.add(cur.right);
            }
            resList.add(list);
            levelNum++;
        }
        return resList;
    }
}
