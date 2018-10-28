package round3;

import java.util.Arrays;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 22:40 2018/10/28
 * @Modified By:
 */
public class No16 {
    public int threeSumClosest(int[] nums, int target) {
        int res = nums[0] + nums[1] + nums[nums.length - 1];
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; ++i){
            int l = i+1,h = nums.length-1;
            while(l < h){
                int sum = nums[i] + nums[l] + nums[h];
                if(sum == target) return target;
                else if(sum > target) h--;
                else l++;
                if(Math.abs(sum - target) < Math.abs(res - target)) res = sum;
            }
        }
        return res;
    }
}
