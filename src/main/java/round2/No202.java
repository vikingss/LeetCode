package round2;

import java.util.HashSet;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 17:17 2018/10/24
 * @Modified By:
 */
public class No202 {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(set.add(n)){
            int tmp = 0;
            while(n > 0){
                int remain = n % 10;
                tmp += remain * remain;
                n /= 10;

            }
            if(tmp == 1) return true;
            else n = tmp;
        }
        return false;
    }

}
