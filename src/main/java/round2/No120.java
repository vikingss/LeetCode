package round2;

import java.util.List;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 10:59 2018/10/18
 * @Modified By:
 */
public class No120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[] res = new int[triangle.size()+1];
        for(int i = triangle.size() - 1; i >= 0; i--){
            List<Integer> tmp = triangle.get(i);
            for(int j = 0; j < tmp.size(); ++j){
                res[j] = Math.min(res[j],res[j+1]) + tmp.get(j);
            }
        }
        return res[0];
    }
}
