package round1;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
 *
 *
 * 进阶：
 *
 * 你可以优化你的算法到 O(k) 空间复杂度吗？
 */
public class firstLevel54 {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> resList = new ArrayList<Integer>();
        resList.add(1);
        if (rowIndex == 0) {
            return resList;
        } else {
            for (int i = 1; i <= rowIndex; i++) {
                ArrayList<Integer> tmp = new ArrayList<Integer>();
                tmp.add(1);
                for (int j = 1; j < i; ++j) {
                    tmp.add(resList.get(j) + resList.get(j - 1));
                }
                tmp.add(1);
                resList = tmp;
            }
        }
        return resList;

    }
}
