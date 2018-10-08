package com.viki.leetcode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 16:06 2018/9/30
 * @Modified By:
 */
public class firstLevel160 {
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0],nums[1]);
        return Math.max(robStreet(nums,0,nums.length-2),robStreet(nums,1,nums.length-1));
    }

    private int robStreet(int[] nums, int start, int length) {
        int n = length - start + 1;
        int[] tmp = new int[n];
        tmp[0] = nums[start];
        tmp[1] = Math.max(nums[start],nums[start+1]);
        for(int i = 2; i < n; i++){
            tmp[i] = Math.max(tmp[i-2] + nums[start+i],tmp[i-1]);
        }
        return tmp[n-1];
    }
}
