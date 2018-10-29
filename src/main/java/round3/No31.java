package round3;

import java.util.Arrays;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 14:46 2018/10/29
 * @Modified By:
 */
/*
   1.极端情况，如： 3 2 1

    这种情况就可以直接将数组排序即可   

      2.最喜欢的情况： 1 2 3

            这种情况只需要将2与3互换位置 

       3.平常且难想的情况： 假如给的数组序列为： 5 4 7 5 3 2

     此时我们该如何动手呢？好了，这个时候就是展现真正本领的时候了....

    请注意，上面的情况中5 4 7 5 3 2 序列中是蓝色的有序的，即依次降序，
    可以说明，这个时候5 4 7 5 3 2所组成的数字是最大的（绿色部分），
    所以下一步是找到比这个数字更大的数字，那么只能往前考虑了，即把4加入到 54 7 5 3 2 中，
    那么就是 54 7 5 3 2，
    意思就是找到比5 4 7 5 3 2大的数字中的最小的一个。
    用肉眼去看，是 55 2 3 4 7
    所以我们是找到了比5 4 7 5 3 2 大的数字中的最小的一个，
    方法是在黄色序列中（7 5 3 2）找到比红色（4）大的数字中最小的一个，
    然后互换两者的位置 5 57 4 3 2 ，还没完，此时还不是索要找的数字。将蓝色部分排序后 ： 5 5 2 3 4 7，这就是慢要求的下一个数字。
*/
public class No31 {
    public void nextPermutation(int[] nums) {
        if(nums.length == 0) return;
        int pos = -1;
        for(int i = nums.length-2; i >= 0 ; i--){
            if(nums[i] < nums[i+1]){
                pos = i;
                break;
            }
        }
        if (pos == -1) {
            Arrays.sort(nums);
            return;
        }
        int k = -1,value = Integer.MAX_VALUE;
        for(int i = pos+1; i < nums.length;  ++i){
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
        System.out.println(1);
    }
}
