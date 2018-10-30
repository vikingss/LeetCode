package round3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 09:19 2018/10/30
 * @Modified By:
 */
public class No47 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> resList = new ArrayList<>();
        if(nums.length == 0) return resList;
        Arrays.sort(nums);
        backtrack(resList,new ArrayList<>(),nums,new boolean[nums.length]);
        return resList;
    }

    private void backtrack(List<List<Integer>> resList, ArrayList<Integer> list, int[] nums,boolean[] used) {
        if(list.size() == nums.length) resList.add(new ArrayList<>(list));
        else{
            for(int i = 0; i < nums.length; ++i){
                if(used[i] || i > 0 && nums[i] == nums[i-1] && !used[i-1]) continue;
                list.add(nums[i]);
                used[i] = true;
                backtrack(resList,list,nums,used);
                list.remove(list.size()-1);
                used[i] = false;
            }
        }
    }
}
