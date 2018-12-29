package round2;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 15:58 2018/10/25
 * @Modified By:
 */
public class quickSort {
    public static void quickSort(int[] nums,int start,int end){
        if(start > end) return;
        int l = start;
        int h = end;
        int key = nums[start];
        while(l <= h){
            while(l <= h && nums[h] >= key) {
                h--;
            }
            nums[l] = nums[h];
            while(l <= h && nums[l] <= key) {
                l++;
            }
            nums[h] = nums[l];
        }
        nums[l] = key;
        quickSort(nums,start,l-1);
        quickSort(nums,l+1,end);
    }


    public static void main(String[] args) {
        int[] nums = {2,3,1,4,6,8,7};
        quickSort(nums,0,nums.length -1);
        for (int i = 0; i < nums.length; ++i) {
            System.out.println(nums[i]);
        }
    }
}
