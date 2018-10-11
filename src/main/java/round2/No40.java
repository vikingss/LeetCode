package round2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 10:27 2018/10/10
 * @Modified By:
 */
public class No40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> resList = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(resList,new ArrayList<>(),candidates,target,0);
        return resList;
    }

    private void backtrack(List<List<Integer>> resList, ArrayList<Integer> list, int[] candidates,
        int remain, int pos) {
        if(remain < 0) return;
        if(remain == 0) resList.add(new ArrayList<>(list));
        else{
            for(int i = pos; i < candidates.length; ++i){
                if(i > pos && candidates[i] == candidates[i-1]) continue;
                list.add(candidates[i]);
                backtrack(resList,list,candidates ,remain - candidates[i],i+1);
                list.remove(list.size() - 1);
            }
        }
    }
}
