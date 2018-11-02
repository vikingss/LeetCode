package round3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 09:43 2018/11/2
 * @Modified By:
 */
public class No118 {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> resList = new ArrayList<>();
        if (numRows <= 0) {
            return resList;
        }
        gen(resList, new ArrayList<>(), 1, numRows);
        return resList;
    }

    private void gen(List<List<Integer>> resList, List<Integer> list, int cur, int numRows) {
        if (cur > numRows) {
            return;
        }
        list.add(1);
        if (!resList.isEmpty()) {
            List<Integer> lastList = resList.get(resList.size() - 1);
            for (int i = 1; i < lastList.size(); ++i) {
                list.add(lastList.get(i) + lastList.get(i - 1));
            }
            list.add(1);
        }
        resList.add(new ArrayList<>(list));
        gen(resList,list,++cur,numRows);
    }
}
