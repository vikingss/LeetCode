package round3;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 10:55 2018/11/6
 * @Modified By:
 */
public class No187 {
    public void rotate(int[] nums, int k) {
        if(nums.length == 0) return;
        k %= nums.length;
        reverse(nums,0,nums.length);
        reverse(nums,0,k);
        reverse(nums,k,nums.length);

    }

    private void reverse(int[] nums, int start, int end) {
        int i = start,j = end-1;
        while(i < j){
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
            i++;
            j--;
        }
    }
}
