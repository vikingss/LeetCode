package round2;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 15:33 2018/10/23
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




    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(findPeakElement(nums));
    }
}
