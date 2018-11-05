package round3;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 16:50 2018/11/5
 * @Modified By:
 */
public class No153 {
    public static int findMin(int[] nums) {
        if(nums.length == 0) return Integer.MIN_VALUE;
        int l = 0,h = nums.length-1;
        while(l < h){
            int mid = l + (h - l) / 2;
            if(nums[mid] > nums[h]) l = mid+1;
            else h = mid ;
        }
        return nums[l];
    }

    public static void main(String[] args) {
        int[] nums = {3,1,2};
        System.out.println(findMin(nums));
    }
}
