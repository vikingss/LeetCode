package round3;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 10:25 2018/11/6
 * @Modified By:
 */
public class No172 {
    public int trailingZeroes(int n) {
        if(n < 5) return 0;
        int res = 0;
        while( n != 0){
            int k = n / 5;
            res += k;
            n = k;
        }
        return res;
    }
}
