package round2;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 14:40 2018/10/19
 * @Modified By:
 */
public class No136 {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int i = 0; i < nums.length; ++i) res = res ^ nums[i];
        return res;
    }
}
