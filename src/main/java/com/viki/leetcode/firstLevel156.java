package com.viki.leetcode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 16:33 2018/9/29
 * @Modified By:
 */
public class firstLevel156 {
    public static int findKthLargest(int[] nums, int k) {
        int pivot = nums[0];
        int left = 0;
        int right = nums.length -1;
        while(true) {
            int pos = partition(nums, left, right);
            if(pos  == k - 1) return nums[pos];
            else if(pos < k - 1) left = pos + 1;
            else right = pos - 1;
        }
    }

    private static int partition(int[] a, int start, int end) {

        int key = a[start];
        while(start < end){
            while(start < end && a[end] <= key) {
                end--;
            }
            a[start] = a[end];
            while(start < end && a[start] > key){
                start++;
            }
            a[end] = a[start];
        }
        a[start] = key;
        return start;
    }

    public static void main(String[] args){
        int[] nums = {2,5,4,4,3,6,1};
        System.out.println(findKthLargest(nums,4));
    }

}
