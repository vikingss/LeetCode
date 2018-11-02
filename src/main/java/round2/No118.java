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
        List<List<Integer>> resList = new ArrayList<List<Integer>>();
        ArrayList<Integer> row = new ArrayList<Integer>();
        for(int i=0;i<numRows;i++) {
            row.add(0, 1);
            for(int j=1;j<row.size()-1;j++){
                row.set(j, row.get(j)+row.get(j+1));
            }
            resList.add(new ArrayList<Integer>(row));
        }
        return resList;

    }

}
