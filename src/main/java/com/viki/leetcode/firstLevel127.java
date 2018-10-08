package com.viki.leetcode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 16:59 2018/7/30
 * @Modified By:
 */
public class firstLevel127 {
    public static int low = 0;
    public static int maxLen = 0;
    public static String longestPalindrome(String s) {
        if(s == null || s.length() < 2) return s;

        for(int i = 0;  i <  s.length() - 1; ++i){
            extendPalindrome(s,i,i);
            extendPalindrome(s,i,i + 1);
        }
        return s.substring(low,low + maxLen);

    }

    private static void extendPalindrome(String s, int i, int j) {
        while(i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)){
            i--;
            j++;
        }
        if(maxLen < j - i - 1){
            maxLen = j - i - 1;
            low = i + 1;
        }
    }
}
