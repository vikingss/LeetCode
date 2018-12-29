package round1;

import round1.firstLevel27.TreeNode;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 11:19 2018/8/6
 * @Modified By:
 */
public class firstLevel140 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result  = new LinkedList<List<Integer>>();
        List<Integer> currentResult  = new LinkedList<Integer>();
        pathSum(root,sum,currentResult,result);
        return result;
    }

    public void pathSum(TreeNode root,int sum,List<Integer> currentResult,List<List<Integer>> result){
        if(root == null) return;
        currentResult.add(root.val);
        if(root.left == null && root.right == null && sum == root.val){
            result.add(new LinkedList<>(currentResult));
            currentResult.remove(currentResult.size()-1);
            return;
        }else {
            pathSum(root.left, sum - root.val, currentResult, result);
            pathSum(root.right, sum - root.val, currentResult, result);
        }
        currentResult.remove(currentResult.size() - 1);


    }
//    public void pathSum(TreeNode root, int sum, List<Integer> currentResult,
//        List<List<Integer>> result) {
//
//        if (root == null)
//            return;
//        currentResult.add(new Integer(root.val));
//        if (root.left == null && root.right == null && sum == root.val) {
//            result.add(new LinkedList(currentResult));
//            currentResult.remove(currentResult.size() - 1);//don't forget to remove the last integer
//            return;
//        } else {
//            pathSum(root.left, sum - root.val, currentResult, result);
//            pathSum(root.right, sum - root.val, currentResult, result);
//        }
//        currentResult.remove(currentResult.size() - 1);
//    }

}
