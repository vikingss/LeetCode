package round3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 16:45 2018/10/29
 * @Modified By:
 */
public class No39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> resList = new ArrayList<>();
        if(candidates.length == 0) return resList;
        Arrays.sort(candidates);
        backtrack(resList,new ArrayList<>(),candidates,0,target);
        return resList;
    }

    private void backtrack(List<List<Integer>> resList, ArrayList<Integer> list, int[] candidates,
        int start,int target) {
        if(start >= candidates.length || target < 0) return;
        if(target == 0){
            resList.add(new ArrayList<>(list));
            return;
        }
        for(int i = start; i < candidates.length; ++i){
            list.add(candidates[i]);
            backtrack(resList,list,candidates,i,target - candidates[i]);
            list.remove(list.size()-1);
        }
    }
}
