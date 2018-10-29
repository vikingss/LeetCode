package round2;

import java.util.Arrays;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 14:30 2018/10/9
 * @Modified By:
 */
//Start from its last element,
// traverse backward to find the first one with index i that satisfy num[i-1] < num[i].\
// So, elements from num[i] to num[n-1] is reversely sorted.
// To find the next permutation, we have to swap some numbers at different positions,
// to minimize the increased amount,we have to make the highest changed position as high as possible.
// Notice that index larger than or equal to i is not possible as num[i,n-1] is reversely sorted. So, we want to increase the number at index i-1, clearly, swap it with the smallest number between num[i,n-1] that is larger than num[i-1]. For example, original number is 121543321, we want to swap the '1' at position 2 with '2' at position 7.
// The last step is to make the remaining higher position part as small as possible, we just have to reversely sort the num[i,n-1]

public class No31 {
    public static void nextPermutation(int[] nums) {
        if(nums.length == 0) return;
        int pos = -1;
        for(int i = nums.length-2; i >=0; --i){
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
        for(int i = pos + 1; i < nums.length; ++i){
            if(nums[i] > nums[pos] && nums[i] < value){ //从断电开始
                k = i;
                value = nums[i];
            }
        }
        int tmp = nums[k];
        nums[k] = nums[pos];
        nums[pos] = tmp;
        Arrays.sort(nums,pos+1,nums.length);
    }

    public static void main(String[] args) {
        int[]  nums = {1,2,3};
        nextPermutation(nums);
        for(int i = 0; i < nums.length; ++i){
            System.out.println(nums[i]);
        }
    }
}
