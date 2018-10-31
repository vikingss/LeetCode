package round3;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 11:24 2018/10/31
 * @Modified By:
 */
public class No77 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> resList = new ArrayList<>();
        int[] nums = new int[n];
        for(int i = 0; i < n; ++i) nums[i] = i+1;
        backtrack(resList,new ArrayList<>(),nums,0,k);
        return resList;
    }

    private void backtrack(List<List<Integer>> resList, ArrayList<Integer> list, int[] nums,
        int start, int k) {
        if(list.size() == k){
            resList.add(new ArrayList<>(list));
            return;
        }
        if(start >= nums.length) return;
        for(int i = start; i < nums.length; ++i){
            list.add(nums[i]);
            backtrack(resList,list,nums,i+1,k);
            list.remove(list.size()-1);
        }
    }
}
