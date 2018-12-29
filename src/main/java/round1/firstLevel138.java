package round1;

import round1.firstLevel27.TreeNode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 09:53 2018/8/6
 * @Modified By:
 */
public class firstLevel138 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) return null;
        return helper(nums,0,nums.length-1);
    }

    private TreeNode helper(int[] nums, int start, int end) {
        if(start > end) return null;
        int mid = (start + end)  / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = helper(nums,start,end -1);
        node.right = helper(nums,mid + 1,end);
        return node;
    }
}
