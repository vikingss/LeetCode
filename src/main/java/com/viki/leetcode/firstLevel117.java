package com.viki.leetcode;

import java.util.Arrays;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 11:05 2018/7/24
 * @Modified By:
 */
public class firstLevel117 {
    public static int[] twoSum(int[] numbers, int target) {
        if(numbers.length == 0 || target < numbers[0])
            return null;
        int[] res = new int[2];
        int i = 0,j = numbers.length - 1;
        while(i < j){
            if(numbers[i] > target){
                return res;
            }
            if( numbers[i] + numbers[j] > target){
                j--;
            }else if(numbers[i] + numbers[j] == target){
                res[0] = i+1;
                res[1] = j+1;
                return res;
            }else if(numbers[i] + numbers[j] < target){
                i++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] numbers={-1,0};
        int target = -1;
        System.out.println(Arrays.toString(twoSum(numbers,target)));
    }
}
