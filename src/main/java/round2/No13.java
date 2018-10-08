package round2;

import java.util.HashMap;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 14:02 2018/10/8
 * @Modified By:
 */
public class No13 {
    public int romanToInt(String s) {
        int result = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('M',1000);
        map.put('D',500);
        map.put('C',100);
        map.put('L',50);
        map.put('X',10);
        map.put('V',5);
        map.put('I',1);


        result = map.get(s.charAt(s.length() - 1));
        for(int i = s.length() -2; i >= 0; i--){
            if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
                result -= map.get(s.charAt(i));
            }else{
                result += map.get(s.charAt(i));
            }
        }
        return result;
    }
}
