package round3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 10:44 2018/11/6
 * @Modified By:
 */
public class No179 {
    public String largestNumber(int[] nums) {
        if(nums.length == 0) return null;
        String[] s_nums = new String[nums.length];
        for(int i = 0; i < nums.length; ++i){
            s_nums[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(s_nums, (o1, o2) -> (o2+o1).compareTo(o1+o2));
        StringBuilder sb = new StringBuilder();
        if(s_nums[0].equals("0")) return "0";
        for(int i = 0; i < s_nums.length; ++i){
            sb.append(s_nums[i]);
        }
        return sb.toString();
    }
}
