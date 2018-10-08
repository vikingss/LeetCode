package com.viki.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 14:17 2018/7/13
 * @Modified By:
 */
public class firstLevel105 {

    public static List<String> letterCombinations(String digits) {

        String[] dic = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> resList = new ArrayList<>();
        if(digits.length() == 0){
            return resList;
        }
        resList.add("");
        for (int i = 0; i < digits.length(); ++i) {
            resList = combine(dic[digits.charAt(i) - '0'], resList);
        }
        return resList;
    }

    private static List<String> combine(String str, List<String> resList) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); ++i) {
            for (String s : resList) {
                list.add(s + str.charAt(i));
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String s = "234";
        System.out.println(letterCombinations(s));
    }
}
