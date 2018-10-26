package round3;

import java.util.HashMap;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 15:22 2018/10/26
 * @Modified By:
 */
public class No1 {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        if(nums.length == 0) return res;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; ++i){
            if(map.containsKey(target - nums[i])){
                res[0] = map.get(target-nums[i]);
                res[1] = i;
                return res;
            }
            map.put(nums[i],i);
        }
        return res;
    }
}
