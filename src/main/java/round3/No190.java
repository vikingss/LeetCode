package round3;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 11:01 2018/11/6
 * @Modified By:
 */
public class No190 {
    public static int reverseBits(int n) {
        int res = 0;
        for(int i = 0; i < 32; ++i){
            res += n & 1;
            n = n >>>1;
            if(i < 31) {
                res = res << 1;
            }
        }
        return res;
    }
}
