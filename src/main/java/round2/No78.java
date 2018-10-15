package round2;

import java.util.ArrayList;
import java.util.List;

public class No78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> resList = new ArrayList<>();
        backtrack(resList,new ArrayList<Integer>(),nums,0);
        return resList;
    }

    private void backtrack(List<List<Integer>> resList, ArrayList<Integer> list, int[] nums, int start) {
        resList.add(new ArrayList<>(list));
        for(int i = start; i < nums.length; ++i){
            list.add(nums[i]);
            backtrack(resList,list,nums,i+1);
            list.remove(list.size()-1);
        }

    }

}
