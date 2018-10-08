package round2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 16:34 2018/9/30
 * @Modified By:
 */
public class No1 {
    public static int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> ans = new HashMap<Integer, Integer>();
        int a[] = new int[2];
        for(int i = 0; i < numbers.length; i++)
        {
            int key = target - numbers[i];
            if(ans.containsKey(key))
            {
                a[1] = i;
                a[0] = ans.get(key);
            }
            ans.put(numbers[i], i);
        }
        return a;

    }
    public static void main(String[] args){
        int[] nums = {3,2,4};
        int target = 7;
        System.out.println(twoSum(nums,target));
    }
}
