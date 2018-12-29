package round1;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 15:53 2018/9/28
 * @Modified By:
 */
public class firstLevel147 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] num = new int[9];
        for(int i = 0; i < 9; ++i){
            num[i] = i+1;
        }
        List<List<Integer>> resList = new ArrayList<>();

        backtrack(resList,new ArrayList<Integer>(),k,n,num,0);
        return resList;
    }

    private void backtrack(List<List<Integer>> resList, ArrayList<Integer> integers, int k, int n,
        int[] num, int curIndex) {
        if(k == 0 && n == 0) {
            resList.add(new ArrayList<>(integers));
            return;
        }else if(k > 0 && n > 0){
            for (int i = curIndex; i < num.length; i++) {
                if(num[i] > n) break;
                integers.add(num[i]);
                backtrack(resList,integers,k-1,n - num[i],num,i+1);
                integers.remove(integers.size()-1);
            }
        }

    }
}
