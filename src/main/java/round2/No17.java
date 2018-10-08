package round2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 15:02 2018/10/8
 * @Modified By:
 */
public class No17 {
    public List<String> letterCombinations(String digits) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"");
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");
        map.put(0,"");
        List<String> resList = new ArrayList<>();
        if(digits.length() == 0) return resList;
        resList.add("");
        for(int i = 0; i < digits.length(); ++i){
            resList = combine(map.get(Character.getNumericValue(digits.charAt(i))),resList);
        }
        return resList;
    }

    private List<String> combine(String str, List<String> resList) {
        List<String> list = new ArrayList<>();
        for(int i = 0; i < str.length(); ++i){
            for(String s : resList){
                list.add(s + str.charAt(i));
            }
        }
        return list;
    }
}
