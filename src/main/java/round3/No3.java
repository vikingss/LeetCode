package round3;

import java.util.HashMap;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 15:45 2018/10/26
 * @Modified By:
 */
public class No3 {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0) return 0;
        HashMap<Character,Integer> map = new HashMap<>();//char -> pos
        int res = 0;
        for(int i = 0,j = 0; i < s.length(); ++i){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                j = Math.max(j,map.get(ch) + 1);
            }
            map.put(ch,i);
            res = Math.max(res,i - j + 1);
        }
        return res;
    }
}
