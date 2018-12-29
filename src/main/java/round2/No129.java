package round2;

import round1.firstLevel27.TreeNode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 16:10 2018/10/18
 * @Modified By:
 */
public class No129 {
    private int sum = 0;
    public int sumNumbers(TreeNode root) {
        sumNumbers(root,0);
        return sum;
    }

    private void sumNumbers(TreeNode root, int currentSum) {
        if(root == null) return ;
        int pathSum = currentSum  * 10 + root.val;
        if(root.left ==  null && root.right == null) sum += pathSum;
        else{
            sumNumbers(root.left,pathSum);
            sumNumbers(root.right,pathSum);
        }
    }


}
