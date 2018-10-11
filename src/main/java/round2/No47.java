package round2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 11:27 2018/10/10
 * @Modified By:
 */
public class No47 {
    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> resList = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(resList,new ArrayList<>(),nums,new boolean[nums.length]);
        return resList;
    }

    private static void backtrack(List<List<Integer>> resList, ArrayList<Object> tmpList, int[] nums,boolean[] used) {
        if(tmpList.size() == nums.length) resList.add(new ArrayList(tmpList));
        for(int i = 0; i < nums.length; ++i){
            if(used[i] || i > 0 && nums[i] == nums[i-1] && !used[i-1]) continue;
            used[i] = true;
            tmpList.add(nums[i]);
            backtrack(resList,tmpList,nums,used);
            used[i] = false;
            tmpList.remove(tmpList.size()-1);
        }

    }

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        permuteUnique(nums);
    }
}
