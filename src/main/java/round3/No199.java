package round3;

import round1.firstLevel27.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 11:24 2018/11/6
 * @Modified By:
 */
public class No199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> resList = new ArrayList<>();
        view(resList,root,0);
        return resList;
    }

    private void view(List<Integer> resList, TreeNode root, int cur) {
        if(root == null) return;
        if(cur == resList.size()) resList.add(root.val);
        view(resList,root.right,cur+1);
        view(resList,root.left,cur+1);
    }
}
