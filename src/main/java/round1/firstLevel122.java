package round1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Given array nums = [-1, 0, 1, 2, -1, -4],
 *
 * A solution set is: [ [-1, 0, 1], [-1, -1, 2] ]
 */
public class firstLevel122 {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> resList = new ArrayList<>();
        if (nums.length < 3) {
            return resList;
        }

        Arrays.sort(nums);
        if (nums[0] > 0) {
            return resList;
        }
        for (int i = 0; i < nums.length - 2; ++i) {
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int l = i + 1,h = nums.length - 1,sum = -nums[i];
            while(l < h){
                if(nums[l] + nums[h] == sum){
                    resList.add(Arrays.asList(nums[i],nums[l],nums[h]));

                    l++;
                    h--;
                    while(l<h && nums[l] == nums[l-1]) l++;
                    while(l < h && nums[h] == nums[h+1]) h--;

                }else if(nums[l] + nums[h] < sum){
                    l++;
                }else h--;
            }
        }
        return resList;
    }


    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
    }
}
