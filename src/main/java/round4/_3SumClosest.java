package round4;

import java.util.Arrays;
/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 09:46 2019/1/24
 * @Modified By:
 */
public class _3SumClosest {
    public int threeSumClosest(int[] nums, int target) {
        if(nums.length == 0) return target;
        int res = nums[0] + nums[1] + nums[nums.length - 1];//初始值
        //从小到大排序
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; ++i){
            int l = i + 1, h = nums.length - 1;
            while(l < h) {
                int tmp = nums[i] + nums[l] + nums[h];
                if (tmp == target) return target;
                else if (tmp > target) h--; //因为h右边的值都比nums[h]大，所以h--
                else l++;//因为l左边的值都比nums[l]小，所以l++
                if(Math.abs(target - tmp) < Math.abs(target - res)) res = tmp;
            }
        }
        return res;
    }
}
