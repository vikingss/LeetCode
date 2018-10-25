package round2;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 15:49 2018/10/25
 * @Modified By:
 */
public class No213 {
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0],nums[1]);
        return Math.max(robStreet(nums,0,nums.length - 2),robStreet(nums,1,nums.length-1));
    }

    private int robStreet(int[] nums, int start, int length) {
        int n = length - start +  1;
        int[] res = new int[n];
        res[0] = nums[start];
        res[1] = Math.max(nums[start],nums[start+1]);
        for(int i = 2; i < n; ++i){
            res[i] = Math.max(res[i-2] + nums[start+i],res[i-1]);
        }
        return res[n-1];
    }
}
