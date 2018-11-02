package round3;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 15:45 2018/11/2
 * @Modified By:
 */
public class No136 {
    public int singleNumber(int[] nums) {
        int res = nums[0];
        for(int i = 1; i < nums.length; ++i) res ^= nums[i];
        return res;
    }
}
