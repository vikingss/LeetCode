package round3;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 10:15 2018/11/6
 * @Modified By:
 */
public class No169 {
    public int majorityElement(int[] nums) {
        int len = nums.length;
        int res = 0,cnt = 0;
        for(int i = 0; i < len; ++i){
            if(cnt == 0){
                res = nums[i];
                cnt++;
            }else if(res == nums[i]) cnt++;
            else cnt--;
        }
        return res;
    }
}
