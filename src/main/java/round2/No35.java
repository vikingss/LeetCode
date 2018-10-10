package round2;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 15:32 2018/10/9
 * @Modified By:
 */
public class No35 {
    public static int searchInsert(int[] nums, int target) {
        if(nums.length == 0) return 0;
        int l = 0,h = nums.length;
        while(l < h){
            int mid = (l + h) / 2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target) l = mid + 1;
            else h =  mid;
        }
        return l;
    }
    public static void main(String[] args) {
        int[]  nums = {1,2,3,4,5,6};
        System.out.println(searchInsert(nums,0));
//        for(int i = 0; i < res.length; ++i){
//            System.out.println(res[i]);
//        }
    }
}
