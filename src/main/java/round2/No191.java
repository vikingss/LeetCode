package round2;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 17:02 2018/10/24
 * @Modified By:
 */
public class No191 {
    public int hammingWeight(int n) {
        int res = 0;
        while(n != 0){
            res += n & 1;
            n = n >>>1;
        }
        return res;
    }
}
