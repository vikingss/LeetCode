package round3;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 11:09 2018/11/6
 * @Modified By:
 */
public class No191 {
    public int hammingWeight(int n) {
        int res = 0;
        while(n != 0){
            res += n & 1;
            n = n >>> 1;
        }
        return res;
    }
}
