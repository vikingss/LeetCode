package round4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 16:40 2019/1/25
 * @Modified By:
 */
public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> resList = new ArrayList<>();
        if(nums.length == 0) return resList;
        backtrack(resList,new ArrayList<>(),nums,0);
        return resList;

    }

    private void backtrack(List<List<Integer>> resList, List<Integer> list,int[] nums, int start) {
        resList.add(new ArrayList<>(list));
        for(int i = start; i < nums.length; ++i){
            list.add(nums[i]);
            backtrack(resList,list,nums,i + 1);
            list.remove(list.size() - 1);
        }
    }
}
