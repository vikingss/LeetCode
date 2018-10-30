package round3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 09:09 2018/10/30
 * @Modified By:
 */
public class No46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> resList = new ArrayList<>();
        if(nums.length == 0) return resList;
        Arrays.sort(nums);
        backtrack(resList,new ArrayList<>(),nums);
        return resList;
    }

    private void backtrack(List<List<Integer>> resList, ArrayList<Integer> list, int[] nums) {
        if(list.size() == nums.length){
            resList.add(new ArrayList<>(list));
        }else {
            for (int i = 0; i < nums.length; ++i) {
                if(list.contains(nums[i])) continue;
                list.add(nums[i]);
                backtrack(resList, list, nums);
                list.remove(list.size() - 1);
            }
        }
    }
}
