package com.viki.leetcode;

/**
 Given an unsorted array of integers, find the length of longest increasing subsequence.

 Example:

 Input: [10,9,2,5,3,7,101,18]
 Output: 4
 Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
 Note:

 There may be more than one LIS combination, it is only necessary for you to return the length.
 Your algorithm should run in O(n2) complexity.
 Follow up: Could you improve it to O(n log n) time complexity?
 */
public class firstLevel101 {
    public static int lengthOfLIS(int[] nums) {
        int[] max = new int[nums.length];
        for(int i = 0; i < nums.length; ++i){
            max[i] = maxLength(nums,i);
        }
        int res = Integer.MIN_VALUE;

        for(int i = 0; i < max.length; ++i){
            if(res < max[i]){
                res = max[i];
            }
        }
        return res;
    }

    private static int maxLength(int[] nums, int pos) {
        int max = Integer.MIN_VALUE;
        int length = 0;
        for(int i = pos;  i < nums.length; ++i){
            if(max < nums[i]){
                max = nums[i];
                length++;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        int[] nums = {10,9,2,5,3,4};
        System.out.println(lengthOfLIS(nums));
    }
}
