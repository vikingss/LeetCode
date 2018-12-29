package round2;

import round1.firstLevel27.TreeNode;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 10:17 2018/10/17
 * @Modified By:
 */
public class No103 {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> resList = new ArrayList<>();
        if (root == null) {
            return resList;
        }
        Deque<TreeNode> list = new LinkedList<>();
        list.add(root);
        int levelNum = 1;
        while (!list.isEmpty()) {
            List<Integer> tmpList = new ArrayList<>();
            int tmp = list.size();
            for (int i = 0; i < tmp; ++i) {
                TreeNode cur = list.poll();
                if (cur.right != null) {
                    list.add(cur.right);
                }
                if (cur.left != null) {
                    list.add(cur.left);
                }
                if(levelNum % 2 == 0) {
                    tmpList.add(cur.val);
                }else tmpList.add(0,cur.val);

            }
            resList.add(tmpList);
            levelNum++;
        }
        return resList;
    }
}
