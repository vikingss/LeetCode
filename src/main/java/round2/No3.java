package round2;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 08:23 2018/10/7
 * @Modified By:
 */
public class No3 {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }
        int max = 0;
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0,j = 0; i < s.length(); ++i){
            Character ch = s.charAt(i);
            if(map.containsKey(ch)){
                j = Math.max(j,map.get(ch) + 1);
            }
            map.put(ch,i);
            max = Math.max(max,i - j + 1);
        }
        return max;
    }
}
