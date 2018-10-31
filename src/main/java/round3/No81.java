package round3;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 15:44 2018/10/31
 * @Modified By:
 */
public class No81 {
    public boolean search(int[] nums, int target) {
        if(nums.length == 0) return false;
        int l = 0,h = nums.length - 1;
        while(l <= h){
            int mid = l + (h - l) / 2;
            if(nums[mid] == target) return true;
            else if(nums[l] < nums[mid]){
                if(nums[l] <= target && target <= nums[mid]) h = mid - 1;
                else l = mid + 1;
            }else if(nums[l] > nums[mid]){
                if(nums[mid] <= target && target <= nums[h]) l = mid + 1;
                else h = mid - 1;
            }else l++; //nums[l] == nums[mid]
        }
        return false;
    }
}
