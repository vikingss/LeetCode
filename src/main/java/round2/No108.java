package round2;

import round1.firstLevel27.TreeNode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 14:38 2018/10/17
 * @Modified By:
 */
public class No108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) return null;
        return build(nums,0,nums.length-1);
    }

    private TreeNode build(int[] nums, int start, int end) {
        if(start > end) return null;
        int mid = start + (end - start)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = build(nums,start,mid-1);
        node.right = build(nums,mid+1,end);
        return node;
    }
}
