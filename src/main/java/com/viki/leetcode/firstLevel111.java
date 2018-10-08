package com.viki.leetcode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 16:26 2018/7/16
 * @Modified By:
 */
public class firstLevel111 {
    public static String addBinary(String a, String b) {
        int m = a.length();
        int n = b.length();
        if(m == 0) return b;
        if(n == 0) return a;
        int curry = 0,i = m - 1,j =  n - 1;
        StringBuilder sb = new StringBuilder();
        while(i >= 0 && j >= 0){
            int tmp = a.charAt(i) - '0' + b.charAt(j) - '0' + curry;
            curry = tmp / 2;
            sb.append(tmp % 2);
            i--;
            j--;
        }
        while(i >= 0){
            int tmp = a.charAt(i) - '0' + curry;
            curry = tmp / 2;
            sb.append(tmp % 2);
            i--;
        }
        while(j >= 0){
            int tmp = b.charAt(j) - '0' + curry;
            curry = tmp / 2;
            sb.append(tmp % 2);
            j--;
        }
        sb = curry == 0 ? sb : sb.append(curry);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "1",b = "111";
        System.out.println(addBinary(a,b));
    }
}
