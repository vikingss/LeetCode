package round2;

public class No153 {
    public int findMin(int[] nums) {
        int l = 0,h = nums.length - 1;
        while(l < h){
            int mid = l + (h - l) / 2;
            if(nums[mid] > nums [h]){
                l = mid + 1;
            }else if(nums[mid] < nums[mid+1]){
                h = mid;
            }
        }
        return nums[l];
    }
}
