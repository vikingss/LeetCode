package round4;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 14:43 2019/1/24
 * @Modified By:
 */
public class JumpGame {
    public boolean canJump(int[] nums) {
        int canReachPos = 0;
        for(int i = 0; i < nums.length; ++i){
            if(canReachPos < i) return false;
            canReachPos = Math.max(canReachPos,i + nums[i]);
        }
        return true;
    }
}
