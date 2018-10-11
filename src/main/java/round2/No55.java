package round2;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 17:10 2018/10/10
 * @Modified By:
 */
public class No55 {
    public boolean canJump(int[] nums) {
        int i = 0;
        for(int reach = 0; i < nums.length && i <= reach; ++i){
            reach = Math.max(i + nums[i],reach);
        }
        return i == nums.length;
    }
}
