package round4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 10:11 2019/2/14
 * @Modified By:
 */
public class ThreeSum {
    public static List<List<Integer>>  threeSum(int[] nums) {
        List<List<Integer>> resList = new ArrayList<>();
        if(nums.length == 0) return resList;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; ++i){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int sum = nums[i];
            int l = i + 1,h = nums.length - 1;
            while(l < h){
                if(nums[l] + nums[h] > -sum) h--;
                else if(nums[l] + nums[h] < -sum) l++;
                else {
                    resList.add(Arrays.asList(nums[i],nums[l],nums[h]));
                    l++;
                    h--;
                    while(l < h && nums[l] == nums[l-1]) l++;
                    while(l < h && nums[h] == nums[h+1]) h--;
                }
            }
        }
        return resList;
    }


    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        System.out.println(threeSum(nums));
    }
}
