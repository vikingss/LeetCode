package round3;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 17:07 2018/10/26
 * @Modified By:
 */
public class No7 {
    public int reverse(int x) {
        long res = 0;
        while(x != 0){
            res = res * 10 + x % 10;
            if(res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) return 0;
            x /= 10;
        }
        return (int)res;
    }
}
