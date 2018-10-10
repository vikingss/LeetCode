package round2;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 14:50 2018/10/9
 * @Modified By:
 */
public class No33 {
    public int search(int[] nums, int target) {
        if(nums.length  == 0) return -1;
        int l = 0,h = nums.length - 1;
        while(l <= h){
            int mid = (l + h) / 2;
            if(nums[mid] == target) return mid;
            if(nums[l] <= nums[mid]){
                if(nums[l] <=target && nums[mid] > target) h = mid -1;
                else l = mid + 1;
            }else{
                if(nums[h] >= target && nums[mid] < target) l = mid + 1;
                else h = mid -1;
            }
        }
        return -1;
    }
}
