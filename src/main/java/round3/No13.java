package round3;

import java.util.HashMap;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 17:55 2018/10/26
 * @Modified By:
 */
public class No13 {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('M',1000);
        map.put('D',500);
        map.put('C',100);
        map.put('L',50);
        map.put('X',10);
        map.put('V',5);
        map.put('I',1);
        int res = map.get(s.charAt(s.length()-1));
        for(int i = s.length() - 2; i >= 0; --i){
            int pre = map.get(s.charAt(i));
            int after = map.get(s.charAt(i+1));
            if(pre < after){
                res -= pre;
            }else res += pre;
        }
        return res;
    }
}
