package round4;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 14:24 2019/1/24
 * @Modified By:
 */
public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        //二分
        if(nums.length == 0) return 0;
        int l = 0,h = nums.length - 1;
        if(target > nums[h]) return h + 1;
        while(l <= h){
            int mid = (l + h) / 2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target) l = mid + 1;
            else h = mid - 1;
        }
        return l;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int n = 7;
        System.out.println(searchInsert(nums,n));
    }
}
