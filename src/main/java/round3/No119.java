package round3;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 10:41 2018/11/2
 * @Modified By:
 */
public class No119 {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> resList = new ArrayList<>();
        if (rowIndex < 0) {
            return resList;
        }
        for (int i = 0; i <= rowIndex; ++i) {
            resList.add(0,1);
            for (int j = 1; j < resList.size() - 1; ++j) {
                resList.set(j, resList.get(j) + resList.get(j + 1));
            }
        }
        return resList;
    }
}
