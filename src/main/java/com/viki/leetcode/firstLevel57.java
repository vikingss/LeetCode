package com.viki.leetcode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 12:11 2018/6/24
 * @Modified By:
 */
public class firstLevel57 {
    public static String addStrings(String nums1, String nums2) {
        if(nums1 == null && nums2 == null){
            return null;
        }
        if(nums1 == null){
            return nums2;
        }
        if(nums2 == null){
            return nums1;
        }
        StringBuilder sb = new StringBuilder();
        int i = nums1.length() - 1,j = nums2.length() - 1;
        int curry = 0;
        while(i >= 0 && j >= 0){
            int sum = nums1.charAt(i) - '0' + nums2.charAt(j) - '0' + curry;
            curry = sum / 10;
            sb.append(sum % 10);
            i--;
            j--;
        }
        while(i >= 0){
            int sum = nums1.charAt(i) - '0' + curry;
            curry = sum / 10;
            sb.append(sum % 10);
            i--;
        }
        while(j >= 0){
            int sum = nums2.charAt(j) - '0' + curry;
            curry = sum / 10;
            sb.append(sum % 10);
            j--;
        }
        if(curry > 0){
            sb.append(curry);
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String str1 = "1";
        String str2 = "1";
        firstLevel57.addStrings(str1,str2);
    }
}
