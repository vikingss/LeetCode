package round3;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 09:53 2018/10/29
 * @Modified By:
 */
public class No26 {
    public static int removeDuplicates(int[] nums) {
        if(nums.length < 2) return nums.length;
        int pos = 1;
        for(int i = 1; i < nums.length; ++i){
            if(nums[i] == nums[pos-1]) continue;
            else nums[pos++] = nums[i];
        }
        return pos;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
}
