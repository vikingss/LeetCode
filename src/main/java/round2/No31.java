package round2;

import java.util.Arrays;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 14:30 2018/10/9
 * @Modified By:
 */
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
            if(nums[i] > nums[pos] && nums[i] < value){
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
