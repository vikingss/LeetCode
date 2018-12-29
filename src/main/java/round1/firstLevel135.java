package round1;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 08:32 2018/8/4
 * @Modified By:
 */
public class firstLevel135 {
    public static List<Integer> grayCode(int n) {
        List<Integer> result = new LinkedList<>();
        int x = 1 << n;
        for (int i = 0; i < x; i++) {
            int tmp  = i >> 1;
            result.add(i ^ tmp);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(grayCode(3));
    }
}
