package round2;

import com.viki.leetcode.firstLevel27.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 15:26 2018/10/17
 * @Modified By:
 */
public class No113 {

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> resList = new ArrayList<>();
        backtrack(resList, new ArrayList<>(), root, sum);
        return resList;
    }

    private void backtrack(List<List<Integer>> resList, ArrayList<Integer> list, TreeNode root,
        int sum) {
        if(root == null) return;
        list.add(root.val);
        if (root.left == null && root.right == null && sum == root.val) {
            resList.add(new ArrayList<>(list));
            list.remove(list.size()-1);
            return;
        }else {
            backtrack(resList, list, root.left, sum - root.val);
            backtrack(resList, list, root.right, sum - root.val);
            list.remove(list.size() - 1);
        }
    }
}
