package com.viki.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 15:30 2018/9/28
 * @Modified By:
 */
public class firstLevel146 {
    public List<List<String>> partition(String s) {
        List<List<String>> resList = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        dfs(s,0,temp,resList);
        return resList;
    }

    private void dfs(String s, int index, List<String> temp, List<List<String>> resList) {
        if(index == s.length()){
            resList.add(new ArrayList<>(temp));
            return;
        }
        for(int i = index + 1; i < s.length(); ++i){
            String pre = s.substring(index,i);
            if(!isPrlindrome(pre)) continue;
            temp.add(pre);
            dfs(s,i,temp,resList);
            temp.remove(temp.size()-1);
        }
    }

    private boolean isPrlindrome(String pre) {
        if(pre == null || pre.length() <= 0) return false;
        int i = 0,j = pre.length()-1;
        while(i < j){
            if(pre.charAt(i) != pre.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

}
