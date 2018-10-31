package round3;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 14:55 2018/10/31
 * @Modified By:
 */
public class No80 {

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums) {
            if(i < 2 || n > nums[i-2]){
                nums[i++] = n;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 4, 4, 7};
        int len = removeDuplicates(nums);
        for (int i = 0; i < len; ++i) {
            System.out.println(nums[i]);
        }
    }
}