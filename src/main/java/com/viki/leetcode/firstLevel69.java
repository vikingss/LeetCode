package com.viki.leetcode;

/**

 Given an integer array nums,
 find the contiguous subarray (containing at least one number)
 which has the largest sum and return its sum.

 Example:

 Input: [-2,1,-3,4,-1,2,1,-5,4],
 Output: 6
 Explanation: [4,-1,2,1] has the largest sum = 6.
 Follow up:

 If you have figured out the O(n) solution,
 try coding another solution using the divide and conquer approach, which is more subtle.
 */
public class firstLevel69 {
    public static int maxSubArray(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int curSum = 0;
        int res = Integer.MIN_VALUE;
        for(int i = 0;i  < nums.length; ++i){
           curSum = Math.max(curSum+nums[i],nums[i]);
           res = Math.max(res,curSum);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1};
        System.out.println(maxSubArray(nums));
    }
}
