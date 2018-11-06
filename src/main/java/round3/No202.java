package round3;

import java.util.HashSet;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 13:56 2018/11/6
 * @Modified By:
 */
public class No202 {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(set.add(n)){
            int tmp = 0;
            while(n > 0){
                int a = n % 10;
                tmp +=  a * a;
                n /= 10;
            }
            if(tmp == 1) return true;
            else n = tmp;
        }
        return false;
    }
}
