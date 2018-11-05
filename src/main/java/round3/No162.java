package round3;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 17:24 2018/11/5
 * @Modified By:
 */
public class No162 {
    public static int findPeakElement(int[] nums) {
        int l = 0, h = nums.length - 1;
        while(l < h){
            int mid = l + (h - l) / 2;
            if(nums[mid] < nums[mid+1]){
                l = mid + 1;
            }else{
                h = mid;
            }
        }
        return l;
    }
}
