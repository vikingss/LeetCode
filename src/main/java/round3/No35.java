package round3;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 15:45 2018/10/29
 * @Modified By:
 */
public class No35 {
    public static int searchInsert(int[] nums, int target) {
        if(nums.length == 0) return 0;
        int l = 0,h = nums.length-1;
        while(l <= h){
            int mid = (l + h) / 2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target) l = mid + 1;
            else h = mid -1;
        }
        return l;
    }
    public static void main(String[] args) {
        int[]  nums = {1,2,3,4,5,6};
        System.out.println(searchInsert(nums,2));
//        for(int i = 0; i < res.length; ++i){
//            System.out.println(res[i]);
//        }
    }
}
