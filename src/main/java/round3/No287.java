package round3;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 14:44 2018/11/6
 * @Modified By:
 */
public class No287 {
    public int findDuplicate(int[] nums) {
        if(nums.length == 0)return -1;
        if(nums.length == 1) return nums[0];
        for(int i = 0; i < nums.length; ++i){
            for(int j = i+1; j < nums.length; ++j){
                if(nums[i] == nums[j]) return nums[i];
            }
        }
        return -1;
    }
}
