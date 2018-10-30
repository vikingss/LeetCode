package round3;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 10:15 2018/10/30
 * @Modified By:
 */
public class No53 {
    public int maxSubArray(int[] nums) {
        if(nums.length == 0) return 0;
        int res = Integer.MIN_VALUE;
        int curSum = 0;
        for(int i = 0; i < nums.length; ++i){
            curSum = Math.max(curSum + nums[i],nums[i]); //感觉有点像robber，当前和判断要不要这个，不要就重新初始化
            res = Math.max(res,curSum); //判断最大值
        }
        return res;
    }
}
