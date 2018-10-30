package round3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 09:46 2018/10/30
 * @Modified By:
 */
public class No49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; ++i){
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String str = new String(ch);
            if(map.isEmpty() || !map.containsKey(str)){
                List<String> tmp = new ArrayList<>();
                tmp.add(strs[i]);
                map.put(str,tmp);
            }else{
                List<String> tmp =map.get(str);
                tmp.add(strs[i]);
                map.put(str,tmp);
            }
        }
        return map.values().parallelStream().collect(Collectors.toList());
    }
}
