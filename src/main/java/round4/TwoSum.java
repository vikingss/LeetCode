package round4;

import java.util.HashMap;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 17:22 2018/12/26
 * @Modified By:
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        if(nums.length == 0) return res;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; ++i){
            int tmp = target - nums[i];
            if(map.containsKey(tmp)) {
                res[0] = map.get(tmp);
                res[1] = i;
                return res;
            }
            map.put(nums[i],i);
        }
        return res;
    }
}
