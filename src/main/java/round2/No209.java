package round2;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 15:11 2018/10/25
 * @Modified By:
 */
public class No209 {

    public int minSubArrayLen(int s, int[] nums) {
        if(nums.length == 0) return 0;
        int res = Integer.MAX_VALUE;
        int curSum = 0, i = 0, j = 0;
        while (j < nums.length) {
            curSum += nums[j];
            while (curSum >= s) {
                res = Math.min(res,j-i+1);
                curSum -= nums[i++];
            }
            j++;
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}
