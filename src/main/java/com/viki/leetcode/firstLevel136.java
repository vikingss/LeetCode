package com.viki.leetcode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 08:50 2018/8/4
 * @Modified By:
 */
public class firstLevel136 {
//    public static int numDecodings(String s) {
//        if(s == null || s.length() == 0) {
//            return 0;
//        }
//        int n = s.length();
//        int[] dp = new int[n+1];
//        dp[0] = 1;
//        dp[1] = s.charAt(0) != '0' ? 1 : 0;
//        for(int i = 2; i <= n; i++) {
//            int first = Integer.valueOf(s.substring(i-1, i));
//            int second = Integer.valueOf(s.substring(i-2, i));
//            if(first >= 1 && first <= 9) {
//                dp[i] += dp[i-1];
//            }
//            if(second >= 10 && second <= 26) {
//                dp[i] += dp[i-2];
//            }
//        }
//        return dp[n];
//    }
    public static int numDecodings1(String s){
        int n = s.length();
        int [] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = s.charAt(0) == '0' ? 0:1;
        for(int i = 2;  i <= n ;++i){
            int fi = Integer.valueOf(s.substring(i-1,i));
            int se = Integer.valueOf(s.substring(i-2,i));
            if(fi >= 1 && fi <= 9) dp[i] += dp[i-1];
            if(se >= 10 && se <= 26) dp[i] += dp[i-2];
        }
        return dp[n];
    }




}
