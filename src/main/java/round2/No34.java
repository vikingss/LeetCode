package round2;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 15:03 2018/10/9
 * @Modified By:
 */
public class No34 {
    // returns leftmost (or rightmost) index at which `target` should be
    // inserted in sorted array `nums` via binary search.
    public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1,-1};
        int leftIndex = extremeLeft(nums,target,true);
        if(leftIndex == nums.length || nums[leftIndex] != target) return result;
        int rightIndex = extremeLeft(nums,target,false) - 1;
        result[0] = leftIndex;
        result[1] = rightIndex;
        return result;

    }

    private static int extremeLeft(int[] nums, int target, boolean isLeft) {
        int l = 0,h = nums.length;
        while(l < h){
            int mid = (l + h) / 2;
            if(nums[mid] > target || (isLeft && nums[mid] == target)){
                h = mid;
            }else{
                l = mid + 1;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        int[]  nums = {1,2,3,3,4,4,4,5,5,6,6};
        int[] res = searchRange(nums,5);
        for(int i = 0; i < res.length; ++i){
            System.out.println(res[i]);
        }
    }
}
