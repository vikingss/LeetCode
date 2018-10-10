package round2;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 09:59 2018/10/9
 * @Modified By:
 */
public class No26 {
    public static int removeElement(int[] nums, int val) {
        if(nums.length == 0) return 0;
        int pos = 0;
        for(int i = 0; i < nums.length; ++i){
            if(nums[i] != val){
                nums[pos++] = nums[i];
            }
        }
        return pos;
    }
    public static void main(String[] args) {
        int[]  nums = {0,2,1,1,1,3,2,2,3,4};
        int len = removeElement(nums,2);
        System.out.println("len:"+len);
        for(int i = 0; i < len; ++i){
            System.out.println(nums[i]);
        }
    }
}
