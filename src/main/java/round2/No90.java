package round2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 15:32 2018/10/16
 * @Modified By:
 */
public class No90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> resList = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(resList,new ArrayList<>(),nums,0);
        return resList;
    }

    private void backtrack(List<List<Integer>> resList, ArrayList<Integer> list,int[] nums, int start) {
        resList.add(new ArrayList<>(list));
        for(int i = start; i < nums.length; ++i){
            if(i > start && nums[i] == nums[i-1])continue;
            list.add(nums[i]);
            backtrack(resList,list,nums,i+1);
            list.remove(list.size() - 1);
        }
    }
}
