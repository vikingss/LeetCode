package round2;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 15:22 2018/10/16
 * @Modified By:
 */
public class No89 {
    public static List<Integer> grayCode(int n) {
        List<Integer> result = new LinkedList<>();
        for (int i = 0; i < 1<<n; i++) {
            result.add(i ^ i>>1);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(grayCode(4));
    }

}
