package round3;


/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 11:13 2018/10/31
 * @Modified By:
 */
public class No75 {
    public void sortColors(int[] nums) {
        if(nums.length == 0) return;
        int i = 0,start = 0,end = nums.length -1;
        while(i <= end){
            if(nums[i] == 2) swap(nums,i,end--);
            else if(nums[i] == 1) i++;
            else if(nums[i] == 0) swap(nums,start++,i++);
        }
    }
    private void swap(int[] nums,int i,int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }


}
