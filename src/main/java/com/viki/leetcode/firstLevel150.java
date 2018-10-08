package com.viki.leetcode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 13:51 2018/9/29
 * @Modified By:
 */
public class firstLevel150 {
    public static boolean wordBreak(String s, Set<String> wordDict) {
        if(s.length() == 0) return false;
        boolean[] dp = new boolean[s.length()+1];
        dp[0] = true;
        for(int i = 1; i < s.length()+1; ++i){
            for(int j = 0; j < i; j++){
                if(dp[j] && wordDict.contains(s.substring(j,i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }

    public static void main(String[] args){
        Set wordDict = new HashSet();
        wordDict.add("leet");
        wordDict.add("code");
        String s = "leetcode";
        System.out.println(wordBreak(s,wordDict));
    }
}
