package round2;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 09:44 2018/10/9
 * @Modified By:
 */
public class No25 {
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int pos = 1;
        for(int i = 1; i < nums.length; ++i){
            if(nums[i] != nums[i-1]){
                nums[pos++] = nums[i];
            }
        }
        return pos;
    }

    public static void main(String[] args) {
        int[]  nums = {0,0,1,1,1,2,2,3,3,4};
        int len = removeDuplicates(nums);
        System.out.println("len:"+len);
        for(int i = 0; i < len; ++i){
            System.out.println(nums[i]);
        }
    }
}
