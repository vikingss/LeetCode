package round2;

import java.util.HashMap;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 14:57 2018/10/26
 * @Modified By:
 */
public class No560 {

    public int subarraySum(int[] nums, int k) {
        if (nums.length == 0) {
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0, result = 0;
        for (int i = 0; i < nums.length; ++i) {
            sum += nums[i]; //sum[0,j] k = sum[i,j], map = sum[0,i]; i < j
            // judge map has sum[0,i] or not ,if has result add its frequency
            if (map.containsKey(sum - k)) {
                result += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return result;
    }
}
