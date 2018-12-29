package round1;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 17:22 2018/7/5
 * @Modified By:
 */
public class firstLevel84 {

    public static int missingNumber(int[] nums) { //xor
        int res = nums.length;
        for (int i = 0; i < nums.length; i++) {
            res = res ^ i ^ nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        missingNumber(nums);
    }
}
