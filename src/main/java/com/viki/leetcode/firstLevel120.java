package com.viki.leetcode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 13:31 2018/7/24
 * @Modified By:
 */
public class firstLevel120 {
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums)
            if (i < 2 || n > nums[i-2])
                nums[i++] = n;
        return i;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        removeDuplicates(nums);
    }
}
