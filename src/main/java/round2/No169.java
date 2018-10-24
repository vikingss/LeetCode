package round2;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 15:22 2018/10/24
 * @Modified By:
 */
public class No169 {
    //求众数
    public int majorityElement(int[] nums) {
        int res = 0,cnt = 0;
        for(int i = 0; i < nums.length; ++i){
            if(cnt == 0) {
                res = nums[i];
                cnt++;
            }else if(nums[i] == res) cnt++;
            else cnt--;
        }
        return res;
    }
}
