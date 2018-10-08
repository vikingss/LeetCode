package round2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 14:32 2018/10/8
 * @Modified By:
 */
public class No15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        if(nums.length < 3) return resultList;
        Arrays.sort(nums);
        if(nums[0] > 0) return resultList;
        for(int i = 0; i < nums.length - 2; ++i){
            if(i > 0 && nums[i] == nums[i-1]){//避免重复
                continue;
            }
            int l = i+1,h = nums.length-1,sum = -nums[i];
            while(l < h){
                if(nums[l] + nums[h] == sum){
                    resultList.add(Arrays.asList(nums[i],nums[l],nums[h]));
                    l++;
                    h--;
                    while(l < h && nums[l] == nums[l-1])l++;
                    while(l < h && nums[h] == nums[h+1])h--;
                }else if(nums[l] + nums[h] < sum){
                    l++;
                }else h--;
            }
        }
        return resultList;
    }
}
