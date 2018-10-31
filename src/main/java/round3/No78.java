package round3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 11:29 2018/10/31
 * @Modified By:
 */
public class No78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> resList = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(resList,new ArrayList<>(),nums,0);
        return resList;
    }

    private void backtrack(List<List<Integer>> resList, ArrayList<Integer> list, int[] nums, int start) {
        resList.add(new ArrayList<>(list));
        for(int i = start; i < nums.length; ++i){
            list.add(nums[i]);
            backtrack(resList, list,nums,i+1);
            list.remove(list.size()-1);
        }
    }
}
