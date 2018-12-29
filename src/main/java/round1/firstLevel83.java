package round1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 16:28 2018/7/5
 * @Modified By:
 */
public class firstLevel83 {

    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> resList = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; ++i) {
            map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
        }

        for (int i = 0; i < nums2.length; ++i) {
            int a = map.getOrDefault(nums2[i],0);
            if(a != 0){
                resList.add(nums2[i]);
                map.put(nums2[i],a - 1);
            }
        }

        int[]  res = new int[resList.size()];
        for(int i = 0; i < resList.size(); ++i){
            res[i] = resList.get(i);
        }
        return res;
    }
}
