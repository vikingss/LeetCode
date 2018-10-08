package com.viki.leetcode;

import java.util.Arrays;

/**

 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。

 示例 1:

 输入: [1,2,3,4,5,6,7] 和 k = 3
 输出: [5,6,7,1,2,3,4]
 解释:
 向右旋转 1 步: [7,1,2,3,4,5,6]
 向右旋转 2 步: [6,7,1,2,3,4,5]
 向右旋转 3 步: [5,6,7,1,2,3,4]
 */
public class firstLevel3 {
    public void rotate(int[] nums, int k) {
        if(nums.length <= 1){
            return;
        }
        if(k > nums.length){
            k %= nums.length;
        }
        reverse(nums,0,nums.length - k);
        reverse(nums,nums.length - k,nums.length);
        reverse(nums,0,nums.length);
    }

    public void reverse(int[] nums,int start,int end){
        for(int i = start,j = end-1; i!=j && i < j; i++,j--){
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
    }
}
