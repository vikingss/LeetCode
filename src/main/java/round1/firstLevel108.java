package round1;

/**
 Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

 (i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).

 You are given a target value to search. If found in the array return its index, otherwise return -1.

 You may assume no duplicate exists in the array.

 Your algorithm's runtime complexity must be in the order of O(log n).

 Example 1:

 Input: nums = [4,5,6,7,0,1,2], target = 0
 Output: 4
 Example 2:

 Input: nums = [4,5,6,7,0,1,2], target = 3
 Output: -1
 */
public class firstLevel108 {
    //还是二分查找
    public static boolean search(int[] nums, int target) {
        if(nums.length == 0){
            return false;
        }
        int l = 0,r = nums.length - 1;
        while(l <=r){
            int mid = (l + r) / 2;
            if(nums[mid] == target){
                return true;
            }
            if(nums[l] < nums[mid]){//左边有序
                if(nums[mid] >= target && nums[l] <= target){
                    r = mid - 1;
                }else{
                    l = mid+1;
                }
            }else if(nums[l] > nums[mid]){
                if(nums[mid] <= target && target <= nums[r]){
                    l = mid + 1;
                }else{
                    r  = mid - 1;
                }
            }else{
                l++;
            }


        }

        return false;
    }
    public static boolean search1(int[] nums, int target) {
        int start  = 0, end = nums.length - 1;

        //check each num so we will check start == end
        //We always get a sorted part and a half part
        //we can check sorted part to decide where to go next
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target) return true;

            //if left part is sorted
            if(nums[start] < nums[mid]){
                if(target < nums[start] || target > nums[mid]){
                    //target is in rotated part
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }else if(nums[start] > nums[mid]){
                //right part is rotated

                //target is in rotated part
                if(target < nums[mid] || target > nums[end]){
                    end = mid -1;
                }else{
                    start = mid + 1;
                }
            }else{
                //duplicates, we know nums[mid] != target, so nums[start] != target
                //based on current information, we can only move left pointer to skip one cell
                //thus in the worest case, we would have target: 2, and array like 11111111, then
                //the running time would be O(n)
                start ++;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,5,};
        System.out.println(search(nums,1));
    }
}
