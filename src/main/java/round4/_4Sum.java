package round4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 13:49 2019/1/24
 * @Modified By:
 */
public class _4Sum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> resList = new ArrayList<>();
        Arrays.sort(nums);
        if(nums.length < 4) return resList;
        for(int i = 0; i < nums.length - 3; ++i){
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            for(int j = i + 1; j < nums.length - 2; ++j){
                if(j > i + 1 && nums[j] == nums[j - 1]) continue; // j > i + 1 保证不是第一次比较才能跳过
                int l = j + 1, h = nums.length - 1, find = target - nums[i] - nums[j];
                while(l < h){
                    if(nums[l] + nums[h] == find) {
                        resList.add(Arrays.asList(nums[i],nums[j],nums[l],nums[h]));
                        l++;
                        h--;
                        while(l < h && nums[l] == nums[l - 1]) l++; //如果l和之前一样，要么重复计算，要么不是正确答案，所以++
                        while(l < h && nums[h] == nums[h + 1]) h--;//如果h和之前一样，要么重复计算，要么不是正确答案，所以--
                    }
                    else if(nums[l] + nums[h] > find) h--;
                    else l++;
                }
            }
        }
        return resList;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        int target = 0;
        fourSum(nums,target);
    }
}
