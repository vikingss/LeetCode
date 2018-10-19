package round2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 11:27 2018/10/19
 * @Modified By:
 */
public class No131 {
    public List<List<String>> partition(String s) {
        List<List<String>> resList = new ArrayList<>();
        if(s == null || s.length() == 0) return resList;
        backtrack(resList,new ArrayList<>(),0,s);
        return resList;
    }

    private void backtrack(List<List<String>> resList, ArrayList<String> list, int start, String s) {
        if(start == s.length()) {
            resList.add(new ArrayList<>(list));
            return;
        }
        for(int i = start+1; i <= s.length(); ++i){
            String str = s.substring(start,i);
            if(!isPrlindrome(str)) continue;
            list.add(str);
            backtrack(resList,list,i,s);
            list.remove(list.size()-1);
        }

    }

    private boolean isPrlindrome(String str) {
        if(str == null ||   str.length() == 0) return true;
        int i = 0,j = str.length()-1;
        while(i < j){
            if(str.charAt(i++) != str.charAt(j--)) return false;
        }
        return true;
    }
}
