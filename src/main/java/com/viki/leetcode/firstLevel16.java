package com.viki.leetcode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 17:10 2018/6/6
 * @Modified By:
 */
public class firstLevel16 {

    public static boolean isPalindrome(String s) {
        if(s == null || s.length() == 0){
            return true;
        }
        String tmp = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < tmp.length(); ++i){
            if((tmp.charAt(i) >= '0' && tmp.charAt(i) <= '9') || (tmp.charAt(i) >='a' && tmp.charAt(i) <= 'z')){
                sb.append(tmp.charAt(i));
            }
        }
        String str = sb.toString();
        int i = 0;
        int j = str.length() - 1;
        while(i < j){
            if(str.charAt(i) == str.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(firstLevel16.isPalindrome(str));
    }
}
