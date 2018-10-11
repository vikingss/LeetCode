package round2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 09:29 2018/10/10
 * @Modified By:
 */
public class No39 {

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> resList = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(resList,new ArrayList<>(),candidates,target,0);
        return resList;
    }

    private static void backtrack(List<List<Integer>> resList, ArrayList<Integer> list,
        int[] candidates, int remain, int start) {
        if(remain == 0) resList.add(new ArrayList<>(list));
        if(remain < 0) return;
        else{
            for(int i = start; i < candidates.length; ++i){
                list.add(candidates[i]);
                backtrack(resList,list,candidates,remain - candidates[i],i);
                list.remove(list.size() - 1);
            }
        }
    }

}
