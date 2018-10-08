package com.viki.leetcode;

import java.util.Arrays;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 16:04 2018/7/6
 * @Modified By:
 */
public class firstLevel86{
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        if(strs.length <= 0){
            return sb.toString();
        }
        Arrays.sort(strs);
        String rootStr = strs[0];
        String lastStr = strs[strs.length -  1];
        for(int i = 0; i< rootStr.length(); ++i){
            char ch = rootStr.charAt(i);
            if(ch == lastStr.charAt(i) ){
                sb.append(ch);
            }else{
                return sb.toString();
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] strs = { "batbsdkajkdhak" , "cathouse","ca","ca","cat" };
        System.out.println(longestCommonPrefix(strs).toString());
    }
}
