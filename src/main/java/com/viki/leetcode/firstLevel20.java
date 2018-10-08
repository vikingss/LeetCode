package com.viki.leetcode;

/**
 编写一个函数来查找字符串数组中的最长公共前缀。

 如果不存在公共前缀，返回空字符串 ""。

 示例 1:

 输入: ["flower","flow","flight"]
 输出: "fl"
 示例 2:

 输入: ["dog","racecar","car"]
 输出: ""
 解释: 输入不存在公共前缀。
 说明:

 所有输入只包含小写字母 a-z 。
 */
public class firstLevel20 {
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        if(strs.length < 1){
            return "";
        }
        if(strs.length == 1){
            return strs[0];
        }
        for(int i = 0; i < strs[0].length(); ++i){//遍历第一个字符串找公共前缀
            if(compare(strs,i)){
                sb.append(strs[0].charAt(i));
            }else{
                break;
            }
        }
        return sb.toString();
    }

    private static boolean compare(String[] strs, int pos) {
        char ch = strs[0].charAt(pos);
        for(int i = 1; i < strs.length; ++i){
            if(pos >= strs[i].length() || strs[i].charAt(pos) != ch){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] strs = {"aca","cba"};
        System.out.println(firstLevel20.longestCommonPrefix(strs));
    }

}