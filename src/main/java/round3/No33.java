package round3;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 14:55 2018/10/29
 * @Modified By:
 */
public class No33 {
    public int search(int[] nums, int target) {
        if(nums.length == 0) return -1;
        int l = 0,h = nums.length -1;
        while(l <= h){
            int mid = l + (h - l) / 2;
            if(nums[mid] == target) return mid;
            if(nums[l] <= nums[mid]){
                if(nums[l] <= target && target < nums[mid])h = mid-1;
                else l = mid + 1;
            }else{
                if(nums[h] >= target && target > nums[mid]) l = mid+1;
                else h = mid - 1;
            }
        }
        return -1;
    }
}
