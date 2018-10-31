package round3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 17:46 2018/10/31
 * @Modified By:
 */
public class No90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> resList =  new ArrayList<>();
        if(nums.length == 0) return resList;
        Arrays.sort(nums);
        backtrack(resList,new ArrayList<>(),nums,0);
        return resList;
    }

    private void backtrack(List<List<Integer>> resList, ArrayList<Integer> list, int[] nums,
        int start) {
        resList.add(new ArrayList<>(list));
        if(start >= nums.length) return;
        for(int i = start;  i < nums.length; ++i){
            if(i > start && nums[i] == nums[i-1]) continue;
            list.add(nums[i]);
            backtrack(resList,list,nums,i+1);
            list.remove(list.size()-1);
        }

    }
}
