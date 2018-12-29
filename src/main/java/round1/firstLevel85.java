package round1;

import java.util.Arrays;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 13:42 2018/7/6
 * @Modified By:
 */
public class firstLevel85 {
    public static void quickSort(int[] nums,int start,int end){
        if(start >= end){
            return ;
        }
        int l = start;
        int h = end;
        int key =  nums[l];
        while(l < h){
            while(l < h && nums[h] > key){
                h--;
            }
            nums[l] = nums[h];
            while(l < h && nums[l]<key){
                l++;
            }
            nums[h] = nums[l];
        }
        nums[l] = key;
        quickSort(nums,start,l-1);
        quickSort(nums,h+1,end);
    }

    public static void main(String[] args) {
        int[] nums = {4,3,5,2,10,9,8};
        quickSort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
}
