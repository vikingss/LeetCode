package round4;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 14:24 2019/1/29
 * @Modified By:
 */
public class SearchInRotatedSortedArrayII {
    public static boolean search(int[] nums, int target) {
        if(nums.length == 0) return false;
        int l = 0,h = nums.length - 1;
        while(l <= h){
            int mid = l + (h - l) / 2;
            if(nums[mid] == target) return true;
            else if(nums[l] < nums[mid]) {
                if(target <= nums[mid] && target >= nums[l]) h = mid - 1;
                else l = mid + 1;
            } else if(nums[l] > nums[mid]) {
                if (target >= nums[mid] && target <= nums[h]) l = mid + 1;
                else h = mid - 1;
            } else l++; //为了避免死循环 当l == h 且nums[mid] != target时，使l++，跳出循环。
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {2,5,6,0,0,1,2};
        int target = 3;
        System.out.println(search(nums,target));
    }
}
