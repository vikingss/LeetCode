package round2;

import java.util.ArrayList;
import java.util.List;

public class No77 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> reslList = new ArrayList<>();
        int[] sum = new int[n];
        for (int i = 0; i < n; ++i) sum[i] = i+1;
        backtrack(reslList, new ArrayList<Integer>(), sum, 0, k);
        return reslList;
    }

    private void backtrack(List<List<Integer>> reslList, ArrayList<Integer> list, int[] sum, int start, int k) {
        if (list.size() == k) {
            reslList.add(new ArrayList<>(list));
            return;
        }
        for (int i = start; i < sum.length; ++i) {
            list.add(sum[i]);
            backtrack(reslList, list, sum, i + 1, k);
            list.remove(list.size() - 1);
        }

    }
}