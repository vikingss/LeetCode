package round1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 14:48 2018/7/11
 * @Modified By:
 */
public class firstLevel93 {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; ++i) {
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            if(map.isEmpty() || !map.containsKey(key)){
                ArrayList<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(key,list);
            } else {
                List<String> strList = map.get(key);
                strList.add(strs[i]);
                map.put(key,strList);
            }
        }
        return map.values().parallelStream().collect(Collectors.toList());
    }

}
