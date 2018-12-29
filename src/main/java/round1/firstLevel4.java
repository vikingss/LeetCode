package round1;

import java.util.HashMap;
import java.util.Map;

/**
 给定一个整数数组，判断是否存在重复元素。

 如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。

 示例 1:

 输入: [1,2,3,1]
 输出: true
 */
public class firstLevel4{
    public boolean containsDuplicate(int[] nums) {
        if(nums.length == 0){
            return false;
        }

        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; ++i){
            if(map.containsKey(nums[i])){
                return true;
            }
            map.put(nums[i],1);
        }
        return false;
    }
}
