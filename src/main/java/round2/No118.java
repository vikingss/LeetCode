package round2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 10:17 2018/10/18
 * @Modified By:
 */
public class No118 {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> resList = new ArrayList<>();
        build(resList, new ArrayList<>(), 1, numRows);
        return resList;
    }

    private void build(List<List<Integer>> resList, ArrayList<Integer> list, int cur, int numRows) {
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
        build(resList, new ArrayList<>(), ++cur, numRows);
    }

}
