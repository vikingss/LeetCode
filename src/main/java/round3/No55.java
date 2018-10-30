package round3;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 10:52 2018/10/30
 * @Modified By:
 */
public class No55 {

    public static boolean canJump(int[] nums) {
        int canReachPos = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (canReachPos < i) {
                return false;
            }
            canReachPos = Math.max(canReachPos, i + nums[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 0, 4};
        System.out.println(canJump(nums));
    }
}
