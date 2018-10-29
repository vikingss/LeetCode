package round3;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 10:05 2018/10/29
 * @Modified By:
 */
public class No27 {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0) return 0;
        int pos = 0;
        for(int i = 0; i < nums.length; ++i){
            if(nums[i] != val) nums[pos++] = nums[i];
        }
        return pos;
    }
}
