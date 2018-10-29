package round3;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 15:16 2018/10/29
 * @Modified By:
 */
public class No34 {
    public static int[] searchRange(int[] nums, int target) {
        int[] res = {-1,-1};
        if(nums.length == 0) return res;
        int leftIndex = extremeLeft(nums,target,true);
        if(leftIndex == nums.length || nums[leftIndex] != target) return res;
        int rightIndex = extremeLeft(nums,target,false)-1;
        res[0] = leftIndex;
        res[1] = rightIndex;
        return res;
    }

    private static int extremeLeft(int[] nums, int target, boolean isLeft) {
        int l = 0,h = nums.length - 1;
        while(l <= h){
            int mid = (l + h) /2;
            if(nums[mid] > target || (isLeft && nums[mid] == target)) {
                h = mid - 1;
            } else {
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
