package round4;

import java.util.HashMap;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 19:34 2018/12/26
 * @Modified By:
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0) return 0;
        HashMap<Character,Integer> map = new HashMap<>(); //字符和所处的位置
        int res = 0;
        for(int i = 0,j = 0; i < s.length(); ++i){//两个指针i，j ，右边指针一直向前搜索并更新map，
            // 如果在map中找到字符，将左边指针移到该字符之前，并更新map
            // 同时不断计算 i - (j - 1) 长度 = 结果长度取最大的
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                j = Math.max(map.get(ch) + 1,j);
            }
            map.put(ch,i);
            res = Math.max(res,i - j + 1);
        }
        return res;
    }

}
