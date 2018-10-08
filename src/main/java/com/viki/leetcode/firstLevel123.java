package com.viki.leetcode;

import java.util.Arrays;

/**
 * Given array nums = [-1, 2, 1, -4], and target = 1.
 *
 * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 */
public class firstLevel123 {

    public static int threeSumClosest(int[] nums, int target) {

        int res = nums[0] + nums[1] + nums[nums.length - 1];
        if (nums.length < 3) {
            return res;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; ++i) {
            int l = i + 1, h = nums.length - 1;
            while (l < h) {
                int sum = nums[i] + nums[l] + nums[h];
                if(sum == target) return target;
                else if(sum < target){
                    l++;
                }else{
                    h--;
                }
                if(Math.abs(sum - target) < Math.abs(res - target)){
                    res = sum;
                }
            }

        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        System.out.println(threeSumClosest(nums, target));
    }
}
