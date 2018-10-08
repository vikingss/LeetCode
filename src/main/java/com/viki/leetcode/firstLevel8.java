package com.viki.leetcode;

/**

 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。

 示例:

 输入: [0,1,0,3,12]
 输出: [1,3,12,0,0]
 说明:

 必须在原数组上操作，不能拷贝额外的数组。
 尽量减少操作次数
 */
public class firstLevel8 {
    public static void moveZeroes1(int[] nums) {
        if(nums.length == 0){
            return;
        }
        int pos = 0;
        while(pos < nums.length){
            if(nums[pos] == 0){
                int i = findFirstNoZero(nums,pos);
                if(i == nums.length){
                    return;
                }
                int tmp = nums[pos];
                nums[pos] = nums[i];
                nums[i] = tmp;

            }
            pos++;
        }

    }

    public static int findFirstNoZero(int[] nums,int pos){
        if(pos == nums.length - 1){
            return pos + 1;
        }
        for(int i = pos + 1; i < nums.length; ++i){
            if(nums[i] != 0){
                return i;
            }
        }
        return nums.length;
    }


    public static void moveZeroes2(int[] nums) {
        if(nums.length == 0){
            return;
        }
        int pos = 0;
        for(int i = 0; i < nums.length; ++i){
            if(nums[i] != 0){
                nums[pos++] = nums[i];
            }
        }
        for(int i = pos; i <nums.length; ++i){
            nums[i] = 0;
        }

    }
    public static void main(String[] args) {
        int[] a = {0,1,0,3,12,0};
        firstLevel8.moveZeroes2(a);
        for(int i = 0; i < a.length; ++i){
            System.out.println(a[i]);
        }
    }
}
