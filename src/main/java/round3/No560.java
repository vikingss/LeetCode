package round3;

import java.util.HashMap;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 15:42 2018/11/21
 * @Modified By:
 */
public class No560 {
    public static int subarraySum(int[] nums, int k) {
        if(nums.length == 0) return 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0,res = 0;
        map.put(0,1);
        for(int i = 0; i < nums.length; ++i){
            sum += nums[i];
            if(map.containsKey(sum - k)){
                res += map.get(sum - k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums =  {1,1,1};
        int k =  2;
        System.out.println(subarraySum(nums,k));
    }
}
