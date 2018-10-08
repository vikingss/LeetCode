package com.viki.leetcode;

import java.util.Arrays;
import sun.jvmstat.perfdata.monitor.PerfStringVariableMonitor;

/**
 * Given an integer array, you need to find one continuous subarray that if you only sort this
 * subarray in ascending order, then the whole array will be sorted in ascending order, too.
 *
 * You need to find the shortest such subarray and output its length.
 *
 * Example 1: Input: [2, 6, 4, 8, 10, 9, 15] Output: 5 Explanation: You need to sort [6, 4, 8, 10,
 * 9] in ascending order to make the whole array sorted in ascending order. Note: Then length of the
 * input array is in range [1, 10,000]. The input array may contain duplicates, so ascending order
 * here means <=.
 */
public class firstLevel71 {

    public static int findUnsortedSubarray(int[] nums) {
        int[] tmp = new int[nums.length];
        System.arraycopy(nums, 0, tmp, 0, nums.length);
        Arrays.sort(tmp);
        int startPos = -1, endPos = -1;
        for (int i = 0; i < nums.length; ++i) {
            if (tmp[i] != nums[i]) {
                startPos = i;
                break;
            }
        }
        for (int j = nums.length - 1; j > startPos; j--) {
            if (tmp[j] != nums[j]) {
                endPos = j;
                break;
            }
        }
        return startPos == -1 ? 0 : endPos - startPos + 1;

    }

    public static void main(String[] args) {
        int[] nums = {4,2};
        System.out.println(firstLevel71.findUnsortedSubarray(nums));

    }
}
