package com.viki.leetcode;

/**
 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。

 说明：

 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？

 示例 1:

 输入: [2,2,1]
 输出: 1
 */
public class firstLevel5 {
    public int singleNumber(int[] nums) {
        int result = nums[0];
        for(int i = 1; i < nums.length; ++i){
            result = result ^ nums[i];
        }
        return result;
    }
}
