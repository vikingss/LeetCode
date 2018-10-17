package round2;

import com.viki.leetcode.firstLevel27.TreeNode;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 14:24 2018/10/17
 * @Modified By:
 */
public class No107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> resList = new ArrayList<>();
        if(root == null) return resList;
//        Deque<List<Integer>> resDeque = new LinkedList<>();
        Deque<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> tmpList = new ArrayList<>();
            int levelNum = queue.size();
            for(int i = 0; i < levelNum; ++i){
                TreeNode cur = queue.poll();
                tmpList.add(cur.val);
                if(cur.left != null) queue.add(cur.left);
                if(cur.right !=null) queue.add(cur.right);
            }
            resList.add(0,tmpList);
        }
//        while(!resDeque.isEmpty()) resList.add(resDeque.pop());
        return resList;
    }
}
