package round2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 15:01 2018/10/10
 * @Modified By:
 */
public class No49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; ++i){
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String str = new String(ch);
            if(map.isEmpty() || !map.containsKey(str)) {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(str,list);
            }
            else{
                List list = map.get(str);
                list.add(strs[i]);
                map.put(str,list);
            }
        }
        return map.values().parallelStream().collect(Collectors.toList());
    }
}
