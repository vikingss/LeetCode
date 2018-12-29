package round2;

import round1.firstLevel27.TreeNode;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 10:06 2018/10/17
 * @Modified By:
 */
public class No102 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> resList = new ArrayList<>();
        if(root == null) return resList;
        Deque<TreeNode> list = new LinkedList<>();
        list.add(root);
        while(!list.isEmpty()){
            int levelNum = list.size();
            List<Integer> tmpList = new ArrayList<>();
            for(int i = 0; i < levelNum; ++i){
                TreeNode cur = list.poll();
                tmpList.add(cur.val);
                if(cur.left != null) {
                    list.add(cur.left);
                }
                if(cur.right != null) {
                    list.add(cur.right);
                }

            }
            resList.add(tmpList);

        }
        return resList;
    }
}
