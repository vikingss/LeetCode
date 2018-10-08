package com.viki.leetcode;

import java.util.Arrays;

/**
 * 实现获取下一个排列的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列。
 *
 * 如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。
 *
 * 必须原地修改，只允许使用额外常数空间。
 *
 * 以下是一些例子，输入位于左侧列，其相应输出位于右侧列。 1,2,3 → 1,3,2 3,2,1 → 1,2,3 1,1,5 → 1,5,1
 */
public class firstLevel128 {

    public static void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0)
            return;
        int pos = -1;
        for(int i = nums.length - 2; i >= 0; i--){
            if(nums[i] < nums[i+1]){
                pos = i;
                break;
            }
        }
        if(pos == -1){
            Arrays.sort(nums);
            return;
        }
        int k = -1,value = Integer.MAX_VALUE;
        for(int j = pos + 1; j < nums.length; ++j){
            if(nums[j] > nums[pos] && nums[j] < value){
                k = j;
                value = nums[j];
            }
        }
        int tmp = nums[k];
        nums[k] = nums[pos];
        nums[pos] = tmp;
        Arrays.sort(nums,pos + 1,nums.length);
    }


    public static void main(String[] args) {
        int[] nums = {1,3,2};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
}
