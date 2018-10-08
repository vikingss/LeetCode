package com.viki.leetcode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 09:29 2018/7/24
 * @Modified By:
 */
public class firstLevel116 {
    public static int sqrt(int x) {
        if(x == 0){
            return 0;
        }
        int l = 1,h = Integer.MAX_VALUE;
        while(true){
            int mid = l + (h - l) / 2;
            if(mid > x / mid){
                h = mid - 1;
            }else{
                if(mid + 1 > x / (mid + 1))
                    return mid;
                l = mid + 1;
            }
        }
    }
//    public static int sqrt(int x) {
//        if (x == 0)
//            return 0;
//        int left = 1, right = Integer.MAX_VALUE;
//        while (true) {
//            int mid = left + (right - left)/2;
//            if (mid > x/mid) {
//                right = mid - 1;
//            } else {
//                if (mid + 1 > x/(mid + 1))
//                    return mid;
//                left = mid + 1;
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        int x = 16;
//        System.out.println(sqrt(x));
//    }
}
