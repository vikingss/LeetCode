package com.viki.leetcode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 14:41 2018/7/12
 * @Modified By:
 */
public class firstLevel95 {
    public static int countSegments(String s) {
        int res = 0;
        String[] strs = s.split(" ");
        for(int i = 0; i < strs.length; ++i){
            String tmp = strs[i];
            if(!tmp.trim().isEmpty()){
                res++;
            }
        }
        return res;
    }


    public static void main(String[] args) {
        String s = "    i  am a boy   ";
        System.out.println(countSegments(s));
    }
}
