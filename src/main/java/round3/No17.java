package round3;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 22:47 2018/10/28
 * @Modified By:
 */
public class No17 {
    public List<String> letterCombinations(String digits) {
        List<String> resList = new ArrayList<>();
        if(digits == null || digits.length() == 0) return resList;
        resList.add("");
        String[] dic = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        for (int i = 0; i < digits.length(); ++i) {
            resList = change(dic[digits.charAt(i) - '0'], resList);
        }
        return resList;
    }

    private List<String> change(String str, List<String> resList) {
        List<String> list = new ArrayList<>();
        for(int i = 0;i < str.length(); ++i){
            for(String s:resList){
                list.add(s + str.charAt(i));
            }
        }
        return list;
    }
}
