package round2;

import java.util.Arrays;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 16:11 2018/10/24
 * @Modified By:
 */
public class No179 {
    public String largestNumber(int[] nums) {
        StringBuilder sb = new StringBuilder();
        if(nums.length == 0) return sb.toString();
        String[] s_nums = new String[nums.length];
        for(int i = 0; i < nums.length; ++i) s_nums[i] = String.valueOf(nums[i]);

        Arrays.sort(s_nums,(a,b)-> (a+b).compareTo(b+a));
        if(s_nums[0].equals("0")) return "0";
        for(int i = 0; i < s_nums.length; i++) sb.append(s_nums[i]);
        return sb.toString();
    }
}
