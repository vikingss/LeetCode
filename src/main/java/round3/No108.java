package round3;

import round1.firstLevel27.TreeNode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 14:42 2018/11/1
 * @Modified By:
 */
public class No108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) return null;
        return build(nums,0,nums.length-1);
    }

    private TreeNode build(int[] nums, int start, int end) {
        if(start > end || start > nums.length) return null;
        int mid = start + (end - start) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = build(nums,start,mid-1);
        root.right = build(nums,mid+1,end);
        return root;
    }
}
