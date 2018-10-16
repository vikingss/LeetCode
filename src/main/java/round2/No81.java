package round2;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 11:04 2018/10/16
 * @Modified By:
 */
public class No81 {
    public boolean search(int[] nums, int target) {
        if(nums.length == 0) return false;
        int l = 0,h = nums.length-1;
        while(l <= h){
            int mid = l + (h-l) /2;
            if(target == nums[mid]) return true;
            else if(nums[l] < nums[mid]){
                if(nums[mid] >= target && nums[l] <= target){
                    h = mid - 1;
                }else{
                    l = mid+1;
                }
            }else if(nums[l] > nums[mid]){
                if(nums[mid] <= target && nums[h] >= target){
                    l = mid+1;
                }else{
                    h = mid - 1;
                }
            }else l++;
        }
        return false;
    }
}
