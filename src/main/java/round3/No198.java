package round3;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 11:16 2018/11/6
 * @Modified By:
 */
public class No198 {
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for(int i = 2; i < nums.length; ++i){
            dp[i] = Math.max(dp[i-1],dp[i-2] + nums[i]);
        }
        return dp[nums.length-1];
    }
}
