package com.viki.leetcode;

import java.util.ArrayList;
import java.util.List;
import jdk.nashorn.internal.runtime.regexp.joni.encoding.CharacterType;

/**
 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。

 示例 1:

 输入: 121
 输出: true
 示例 2:

 输入: -121
 输出: false
 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 示例 3:

 输入: 10
 输出: false
 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 进阶:

 你能不将整数转为字符串来解决这个问题吗？
 */
public class firstLevel42 {
    public static boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        List<Integer> chList = new ArrayList<Integer>();

        while(x > 0){
            chList.add(x % 10);
            x /= 10;
        }
        int i = 0,j = chList.size() - 1;
        while(i < j){
            if(chList.get(i) != chList.get(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        int x = 11;
        System.out.println(firstLevel42.isPalindrome(x));
    }
}
