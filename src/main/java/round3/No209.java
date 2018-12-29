package round3;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 13:50 2018/11/7
 * @Modified By:
 */
public class No209 {
    public int minSubArrayLen(int s, int[] nums) {
        if(nums.length == 0) return 0;
        int i = 0,j = 0,curSum = 0,res = Integer.MAX_VALUE;
        while(j < nums.length){
            curSum += nums[j];
            while(curSum >= s){
                res = Math.min(res,j - i + 1);
                curSum -= nums[i++];
            }
            j++;
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}
