package round1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 14:33 2018/7/11
 * @Modified By:
 */
public class firstLevel92 {
    public static boolean isAnagram(String s, String t) {
//        Map<Character,Integer> map = new HashMap<Character,Integer>();
//        for(int i = 0; i < s.length(); ++i){
//            char ch = s.charAt(i);
//            map.put(ch,map.getOrDefault(ch,0) + 1);
//        }
//        for(int i = 0; i  < t.length(); ++i){
//            Integer a = map.get(t.charAt(i)) ;
//            if(a == null){
//                return false;
//            }
//            if(--a == 0){
//                map.remove(t.charAt(i));
//            }else {
//                map.put(t.charAt(i), a);
//            }
//        }
//        if(map.isEmpty()){
//            return true;
//        }
//        return false;
        char[] sch = s.toCharArray();
        char[] tch = t.toCharArray();
        Arrays.sort(sch);
        Arrays.sort(tch);
        if(s.length() != t.length()){
            return false;
        }
        for(int i = 0; i <  sch.length; ++i){
            if(sch[i] != tch[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "a";
        String t = "b";
        System.out.println(isAnagram(s,t));
    }
}
