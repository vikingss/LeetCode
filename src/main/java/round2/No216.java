package round2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 11:11 2018/10/24
 * @Modified By:
 */
public class No216 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> resList = new ArrayList<>();
        int[] nums = {1,2,3,4,5,6,7,8,9};
        backtrack(resList,new ArrayList<>(),nums,0,k,n);
        return resList;
    }

    private void backtrack(List<List<Integer>> resList, ArrayList<Integer> list, int[] nums,
        int start,int k ,int n) {
        if(n < 0 || (list.size() == k && n != 0)) return;
        if(list.size() == k && n == 0){
            resList.add(new ArrayList<>(list));
            return;
        }
        for(int i = start; i < nums.length; ++i){
            if(list.contains(nums[i]) || nums[i] > n) continue;
            list.add(nums[i]);
            backtrack(resList,list,nums,i+1,k,n-nums[i]);
            list.remove(list.size()-1);
        }
    }
}
