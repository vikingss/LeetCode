package com.viki.leetcode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 11:56 2018/6/24
 * @Modified By:
 */
public class firstLevel56 {
    public static boolean isOneBitCharacter(int[] bits) {
        if(bits.length == 0){
            return false;
        }
        int length = 0;
        for(int i = 0; i < bits.length; ++i){
            if(i == bits.length - 1 && bits.length - length == 1){
                return true;
            }
            if(bits[i] == 0){
                length++;
            }else{
                length += 2;
                i ++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,0,0};
        firstLevel56.isOneBitCharacter(nums);
    }
}
