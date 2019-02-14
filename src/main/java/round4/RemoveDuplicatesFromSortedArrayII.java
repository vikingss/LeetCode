package round4;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 13:55 2019/1/29
 * @Modified By:
 */
public class RemoveDuplicatesFromSortedArrayII {
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int i = 0;

        for(int n: nums){
            if(i < 2 || n > nums[i-2]) nums[i++] = n;
        }
        return i;
    }

    public static void main(String[] args) {
        int[] nums={1,1,1,2,2,3};
        System.out.println(removeDuplicates(nums));
    }
}
